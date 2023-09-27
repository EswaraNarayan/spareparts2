/**
 *
 */
package com.hybris.spareparts.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.commons.lang3.StringUtils;


/**
 * @author balkaur
 *
 */
public class SparepartsProductSearchResultPopulator implements Populator<SearchResultValueData, ProductData>
{

	@Override
	public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException
	{
		// XXX Auto-generated method stub

		final String brandName = (String) source.getValues().get("brandName");
		final String vehicleModel = (String) source.getValues().get("vehicleModel");



		if (StringUtils.isNoneEmpty(brandName))
		{
			target.setBrandName(brandName);



		}

		if (StringUtils.isNoneEmpty(vehicleModel))
		{
			target.setVehicleModel(vehicleModel);
		}

	}
}


