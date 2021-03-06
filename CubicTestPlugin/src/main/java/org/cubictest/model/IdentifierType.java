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
package org.cubictest.model;


/**
 * The different types of element identification.
 *
 * @author skyttere
 */
public enum IdentifierType {

	//params: displayValue, description, isBoolean
	
	/**
	 * Returning the first hit when indentify in this order;
	 * the text in a label element;
	 * the value attribute for different buttons;
	 * and the text before or after the element.
	 */
	LABEL("Label", "Checks the visible text of the element (or associated label)", false, true, true),

	/** HTML ID attribute */
	ID("Id", "Check the id attribute.", false, true, false),

	/** HTML name attribute */
	NAME("Name", "Check the name attribute.", false, true, false),

	/** HTML value attribute */
	VALUE("Value", "Check the value for input elements.", false, true, false),

	/** HTML href attribute */
	HREF("Href", "Check the URL that is pointed to.", false, true, false),

	/** HTML src attribute */
	SRC("Src", "Check the source URL.", false, true, false),
	
	/** HTML checked attribute */
	CHECKED("Checked", "Check whether the element is checked or not.", true, false, false),

	/** HTML selected attribute */
	SELECTED("Selected", "Check whether the element is selected or not.", true, false, false),

	/** HTML is mulitselectEnabled */
	MULTISELECT("Multiselect", "Check whether it is possible to select several elements.", true, false, false),
	
	/** HTML title attribute */
	TITLE("Tooltip", "Check the tooltip text (title attribute).", false, true, true),
	
	/** Element index in page */
	INDEX("Index", "Check the element's index in the page / Context. " +
			"Default operator is \"=\" (equality), but \">\", \">=\", \"<\" and \"<=\" is also supported", false, false, false),
	
	/** Path to the element */
	PATH("Path", "Check the Path to the element (XPath without attributes)", false, false, false),

	/** HTML name of the element */
	ELEMENT_NAME("Element type", "Check the HTML element type (e.g. \"div\" or \"table\")", false, true, false),

	/** CSS class of the element */
	CLASS("Class", "Check the CSS class of the element", false, true, false),

	/** Alternative text */
	ALT("Alt. text", "Check the alternative text of the element", false, true, true), 
	
	/** The frame type, e.g. frame or iframe */ 
	FRAME_TYPE("Frame type", "The frame type", false, false, false);
	
	private String displayValue;
	private String description;
	private boolean isBoolean;
	private boolean acceptsModerator;

	/** Whether the identifier type typically is pretty for humans to read */
	private boolean isPrettyType;

	private IdentifierType(String displayValue, String description, boolean isBoolean, boolean acceptsModerator, boolean isPrettyType){
		this.displayValue = displayValue;
		this.description = description;
		this.isBoolean = isBoolean;
		this.acceptsModerator = acceptsModerator;
		this.isPrettyType = isPrettyType;
	}


	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return displayValue;
	}
	
	public boolean isBoolean() {
		return isBoolean;
	}

	public boolean acceptsModerator() {
		return acceptsModerator;
	}

	public boolean isPrettyType() {
		return isPrettyType;
	}

}
