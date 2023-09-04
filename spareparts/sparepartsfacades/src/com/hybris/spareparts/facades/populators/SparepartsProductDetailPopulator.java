/**
 *
 */
package com.hybris.spareparts.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.hybris.spareparts.core.model.SparepartsProductModel;


/**
 * @author BALKAUR
 *
 */
public class SparepartsProductDetailPopulator implements Populator<SparepartsProductModel, ProductData>

{

	@Override
	public void populate(final SparepartsProductModel source, final ProductData target) throws ConversionException
	{
		// XXX Auto-generated method stub
		target.setCompatibility(source.getCompatibility());
		target.setWeight(source.getWeight());
		target.setCondition(source.getCondition());
		target.setBrandName(source.getBrandName());
		target.setVehicleModel(source.getVehicleModel());
		target.setModelYear(source.getModelYear());
		target.setCountryOfOrigin(source.getCountryOfOrigin());


	}

}
