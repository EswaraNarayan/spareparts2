/**
 *
 */
package com.hybris.spareparts.facades.customer.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.CustomerAccountService;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.commerceservices.strategies.CustomerNameStrategy;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.Assert;

import com.hybris.spareparts.facades.customer.SparepartCustomerFacade;


/**
 *
 */
public class SparepartCustomerFacadeImpl extends DefaultCustomerFacade implements SparepartCustomerFacade
{

	private ModelService modelService;
	private UserService userService;
	private CustomerNameStrategy customerNameStrategy;
	private CommonI18NService commonI18NService;
	private CustomerAccountService customerAccountService;

	@Override
	public void register(final RegisterData registerData) throws DuplicateUidException
	{
		validateParameterNotNullStandardMessage("registerData", registerData);
		Assert.hasText(registerData.getFirstName(), "The field [FirstName] cannot be empty");
		Assert.hasText(registerData.getLastName(), "The field [LastName] cannot be empty");
		Assert.hasText(registerData.getLogin(), "The field [Login] cannot be empty");
		Assert.hasText(registerData.getMobileNumber(), "The field [Mobile Number] cannot be empty");

		final CustomerModel newCustomer = getModelService().create(CustomerModel.class);
		setCommonPropertiesForRegister(registerData, newCustomer);
		getCustomerAccountService().register(newCustomer, registerData.getPassword());
	}

	@Override
	protected void setCommonPropertiesForRegister(final RegisterData registerData, final CustomerModel customerModel)
	{
		customerModel.setName(getCustomerNameStrategy().getName(registerData.getFirstName(), registerData.getLastName()));
		setTitleForRegister(registerData, customerModel);
		setUidForRegister(registerData, customerModel);
		setMobileForRegister(registerData, customerModel);
		customerModel.setSessionLanguage(getCommonI18NService().getCurrentLanguage());
		customerModel.setSessionCurrency(getCommonI18NService().getCurrentCurrency());
	}

	@Override
	protected void setTitleForRegister(final RegisterData registerData, final CustomerModel customerModel)
	{
		if (StringUtils.isNotBlank(registerData.getTitleCode()))
		{
			final TitleModel title = getUserService().getTitleForCode(registerData.getTitleCode());
			customerModel.setTitle(title);
		}
	}

	@Override
	protected void setUidForRegister(final RegisterData registerData, final CustomerModel customer)
	{
		customer.setUid(registerData.getLogin().toLowerCase());
		customer.setOriginalUid(registerData.getLogin());
	}

	protected void setMobileForRegister(final RegisterData registerData, final CustomerModel customer)
	{
		customer.setMobileNumber(registerData.getMobileNumber());
	}


	@Override
	protected ModelService getModelService()
	{
		return modelService;
	}

	@Override
	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Override
	protected UserService getUserService()
	{
		return userService;
	}

	@Override
	@Required
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	@Override
	protected CustomerNameStrategy getCustomerNameStrategy()
	{
		return customerNameStrategy;
	}

	@Override
	@Required
	public void setCustomerNameStrategy(final CustomerNameStrategy customerNameStrategy)
	{
		this.customerNameStrategy = customerNameStrategy;
	}

	@Override
	protected CommonI18NService getCommonI18NService()
	{
		return commonI18NService;
	}

	@Override
	@Required
	public void setCommonI18NService(final CommonI18NService commonI18NService)
	{
		this.commonI18NService = commonI18NService;
	}

	@Override
	protected CustomerAccountService getCustomerAccountService()
	{
		return customerAccountService;
	}

	@Override
	@Required
	public void setCustomerAccountService(final CustomerAccountService customerAccountService)
	{
		this.customerAccountService = customerAccountService;
	}




}
