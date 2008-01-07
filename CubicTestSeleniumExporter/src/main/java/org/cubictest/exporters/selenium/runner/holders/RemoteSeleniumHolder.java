/*******************************************************************************
 * Copyright (c) 2005, 2008 Christian Schwarz and Stein K. Skytteren
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Christian Schwarz and Stein K. Skytteren - initial API and implementation
 *******************************************************************************/
package org.cubictest.exporters.selenium.runner.holders;

import org.cubictest.common.settings.CubicTestProjectSettings;
import org.cubictest.export.holders.RunnerResultHolder;
import org.cubictest.exporters.selenium.runner.CubicTestRemoteRunnerClient;
import org.cubictest.model.UrlStartPoint;
import org.eclipse.swt.widgets.Display;

/**
 * Holder that has reference to the Selenium test system (for running Selenium commands).
 * Also holds the results of the test and the current contexts (@see ContextHolder).
 * Handles user cancel of the test run.
 *  
 * @author Christian Schwarz
 */
public class RemoteSeleniumHolder extends SeleniumHolder {

	private CubicTestRemoteRunnerClient selenium;
	private boolean seleniumStarted;
	private UrlStartPoint handledUrlStartPoint;
	
	
	public RemoteSeleniumHolder(CubicTestProjectSettings settings) {
		super(null, null, settings);
		//use Selenium from client e.g. the CubicRecorder
		this.selenium = selenium;
	}
	/*
	public SeleniumHolder(int port, String browser, String initialUrl, Display display, CubicTestProjectSettings settings) {
		super(display, settings);
		if (port < 80) {
			throw new ExporterException("Invalid port");
		}
		selenium = new DefaultSelenium("localhost", port, browser, initialUrl);
	}*/
	
	public CubicTestRemoteRunnerClient getSelenium() {
		return selenium;
	}


	
	public boolean isSeleniumStarted() {
		return seleniumStarted;
	}

	public void setSeleniumStarted(boolean seleniumStarted) {
		this.seleniumStarted = seleniumStarted;
	}


	public void setHandledUrlStartPoint(UrlStartPoint initialUrlStartPoint) {
		this.handledUrlStartPoint = initialUrlStartPoint;
	}

	public UrlStartPoint getHandledUrlStartPoint() {
		return handledUrlStartPoint;
	}

	public void setSelenium( CubicTestRemoteRunnerClient cubicTestRemoteRunnerClient) {
		this.selenium = cubicTestRemoteRunnerClient;
	}
	
}