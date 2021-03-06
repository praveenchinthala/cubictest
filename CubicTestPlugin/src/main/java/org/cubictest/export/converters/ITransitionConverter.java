/*******************************************************************************
 * Copyright (c) 2005, 2010 Stein K. Skytteren and Christian Schwarz
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Stein K. Skytteren and Christian Schwarz - initial API and implementation
 *******************************************************************************/
package org.cubictest.export.converters;

import org.cubictest.export.holders.IResultHolder;
import org.cubictest.model.UserInteractionsTransition;


/**
 * Interface converters of a transition to a list of test steps.
 * 
 * @author chr_schwarz
 */
public interface ITransitionConverter<T extends IResultHolder> {
	public void handleUserInteractions(T t, UserInteractionsTransition userInteractions);

}
