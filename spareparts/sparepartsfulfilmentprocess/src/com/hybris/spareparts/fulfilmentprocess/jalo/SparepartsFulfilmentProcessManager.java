/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.spareparts.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hybris.spareparts.fulfilmentprocess.constants.SparepartsFulfilmentProcessConstants;

public class SparepartsFulfilmentProcessManager extends GeneratedSparepartsFulfilmentProcessManager
{
	public static final SparepartsFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SparepartsFulfilmentProcessManager) em.getExtension(SparepartsFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
