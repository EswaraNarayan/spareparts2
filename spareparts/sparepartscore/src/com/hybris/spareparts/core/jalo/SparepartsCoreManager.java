/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.spareparts.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hybris.spareparts.core.constants.SparepartsCoreConstants;
import com.hybris.spareparts.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class SparepartsCoreManager extends GeneratedSparepartsCoreManager
{
	public static final SparepartsCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SparepartsCoreManager) em.getExtension(SparepartsCoreConstants.EXTENSIONNAME);
	}
}
