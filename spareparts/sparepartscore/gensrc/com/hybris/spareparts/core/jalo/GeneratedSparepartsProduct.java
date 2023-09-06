/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 6, 2023, 12:58:17 PM                    ---
 * ----------------------------------------------------------------
 */
package com.hybris.spareparts.core.jalo;

import com.hybris.spareparts.core.constants.SparepartsCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.hybris.spareparts.core.jalo.SparepartsProduct SparepartsProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSparepartsProduct extends Product
{
	/** Qualifier of the <code>SparepartsProduct.compatibility</code> attribute **/
	public static final String COMPATIBILITY = "compatibility";
	/** Qualifier of the <code>SparepartsProduct.weight</code> attribute **/
	public static final String WEIGHT = "weight";
	/** Qualifier of the <code>SparepartsProduct.condition</code> attribute **/
	public static final String CONDITION = "condition";
	/** Qualifier of the <code>SparepartsProduct.brandName</code> attribute **/
	public static final String BRANDNAME = "brandName";
	/** Qualifier of the <code>SparepartsProduct.vehicleModel</code> attribute **/
	public static final String VEHICLEMODEL = "vehicleModel";
	/** Qualifier of the <code>SparepartsProduct.modelYear</code> attribute **/
	public static final String MODELYEAR = "modelYear";
	/** Qualifier of the <code>SparepartsProduct.countryOfOrigin</code> attribute **/
	public static final String COUNTRYOFORIGIN = "countryOfOrigin";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMPATIBILITY, AttributeMode.INITIAL);
		tmp.put(WEIGHT, AttributeMode.INITIAL);
		tmp.put(CONDITION, AttributeMode.INITIAL);
		tmp.put(BRANDNAME, AttributeMode.INITIAL);
		tmp.put(VEHICLEMODEL, AttributeMode.INITIAL);
		tmp.put(MODELYEAR, AttributeMode.INITIAL);
		tmp.put(COUNTRYOFORIGIN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.brandName</code> attribute.
	 * @return the brandName
	 */
	public String getBrandName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.brandName</code> attribute.
	 * @return the brandName
	 */
	public String getBrandName()
	{
		return getBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.brandName</code> attribute. 
	 * @param value the brandName
	 */
	public void setBrandName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.brandName</code> attribute. 
	 * @param value the brandName
	 */
	public void setBrandName(final String value)
	{
		setBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.compatibility</code> attribute.
	 * @return the compatibility
	 */
	public String getCompatibility(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPATIBILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.compatibility</code> attribute.
	 * @return the compatibility
	 */
	public String getCompatibility()
	{
		return getCompatibility( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.compatibility</code> attribute. 
	 * @param value the compatibility
	 */
	public void setCompatibility(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPATIBILITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.compatibility</code> attribute. 
	 * @param value the compatibility
	 */
	public void setCompatibility(final String value)
	{
		setCompatibility( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.condition</code> attribute.
	 * @return the condition
	 */
	public String getCondition(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.condition</code> attribute.
	 * @return the condition
	 */
	public String getCondition()
	{
		return getCondition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.condition</code> attribute. 
	 * @param value the condition
	 */
	public void setCondition(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.condition</code> attribute. 
	 * @param value the condition
	 */
	public void setCondition(final String value)
	{
		setCondition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.countryOfOrigin</code> attribute.
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYOFORIGIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.countryOfOrigin</code> attribute.
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin()
	{
		return getCountryOfOrigin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.countryOfOrigin</code> attribute. 
	 * @param value the countryOfOrigin
	 */
	public void setCountryOfOrigin(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYOFORIGIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.countryOfOrigin</code> attribute. 
	 * @param value the countryOfOrigin
	 */
	public void setCountryOfOrigin(final String value)
	{
		setCountryOfOrigin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.modelYear</code> attribute.
	 * @return the modelYear
	 */
	public String getModelYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODELYEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.modelYear</code> attribute.
	 * @return the modelYear
	 */
	public String getModelYear()
	{
		return getModelYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.modelYear</code> attribute. 
	 * @param value the modelYear
	 */
	public void setModelYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODELYEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.modelYear</code> attribute. 
	 * @param value the modelYear
	 */
	public void setModelYear(final String value)
	{
		setModelYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.vehicleModel</code> attribute.
	 * @return the vehicleModel
	 */
	public String getVehicleModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VEHICLEMODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.vehicleModel</code> attribute.
	 * @return the vehicleModel
	 */
	public String getVehicleModel()
	{
		return getVehicleModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.vehicleModel</code> attribute. 
	 * @param value the vehicleModel
	 */
	public void setVehicleModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VEHICLEMODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.vehicleModel</code> attribute. 
	 * @param value the vehicleModel
	 */
	public void setVehicleModel(final String value)
	{
		setVehicleModel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.weight</code> attribute.
	 * @return the weight
	 */
	public Double getWeight(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, WEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.weight</code> attribute.
	 * @return the weight
	 */
	public Double getWeight()
	{
		return getWeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.weight</code> attribute. 
	 * @return the weight
	 */
	public double getWeightAsPrimitive(final SessionContext ctx)
	{
		Double value = getWeight( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SparepartsProduct.weight</code> attribute. 
	 * @return the weight
	 */
	public double getWeightAsPrimitive()
	{
		return getWeightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, WEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final Double value)
	{
		setWeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final SessionContext ctx, final double value)
	{
		setWeight( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SparepartsProduct.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final double value)
	{
		setWeight( getSession().getSessionContext(), value );
	}
	
}
