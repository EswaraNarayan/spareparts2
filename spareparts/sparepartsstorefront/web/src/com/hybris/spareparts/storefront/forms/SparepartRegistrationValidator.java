/**
 *
 */
package com.hybris.spareparts.storefront.forms;


import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.RegistrationValidator;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;


@Component("sparepartregistrationValidator")
public class SparepartRegistrationValidator extends RegistrationValidator
{

	@Override
	public boolean supports(final Class<?> aClass)
	{
		return SparepartRegisterForm.class.equals(aClass);
	}

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final SparepartRegisterForm registerForm = (SparepartRegisterForm) object;
		final String titleCode = registerForm.getTitleCode();
		final String firstName = registerForm.getFirstName();
		final String lastName = registerForm.getLastName();
		final String email = registerForm.getEmail();
		final String pwd = registerForm.getPwd();
		final String checkPwd = registerForm.getCheckPwd();
		final boolean termsCheck = registerForm.isTermsCheck();
		final String mobileNumber = registerForm.getmobileNumber();

		validateTitleCode(errors, titleCode);
		validateName(errors, firstName, "firstName", "register.firstName.invalid");
		validateName(errors, lastName, "lastName", "register.lastName.invalid");


		if (StringUtils.length(firstName) + StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "register.name.invalid");
			errors.rejectValue("firstName", "register.name.invalid");
		}

		validateEmail(errors, email);
		validatePassword(errors, pwd);
		comparePasswords(errors, pwd, checkPwd);
		validateTermsAndConditions(errors, termsCheck);
		validateMobileNumber(errors, mobileNumber);
	}


	private void validateMobileNumber(final Errors errors, final String mobileNumber)
	{

		if (StringUtils.isEmpty(mobileNumber))
		{
			errors.rejectValue("mobileNumber", "register.mobile.invalid");
		}
		else if (StringUtils.length(mobileNumber) > 10 || StringUtils.length(mobileNumber) < 10)
		{
			errors.rejectValue("mobileNumber", "register.mobileNumber.invalid");
		}

	}

}




