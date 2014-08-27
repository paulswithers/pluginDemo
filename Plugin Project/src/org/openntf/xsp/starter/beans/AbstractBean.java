/*
 * � Copyright GBS Inc 2011
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package org.openntf.xsp.starter.beans;

import java.io.Serializable;

import com.ibm.xsp.context.FacesContextEx;
import com.paulwithers.iconuk.demoPlugin.Activator;
import com.paulwithers.iconuk.demoPlugin.Library;
import com.paulwithers.iconuk.demoPlugin.DemoUtils;

public class AbstractBean implements Serializable {
	private final static boolean _debug = Activator._debug;
	private static final long serialVersionUID = 4755914366416862241L;

	public static AbstractBean getCurrentInstance(String suffix) {
		AbstractBean result = null;
		result = (AbstractBean) DemoUtils.resolveVariable(FacesContextEx.getCurrentInstance(), Library.LIBRARY_BEAN_PREFIX
				+ suffix);
		return result;
	}

	public String getName() {
		return getClass().getName();
	}

	protected void _debugOut(String message) {
		if (_debug)
			System.out.println(getClass().getName() + " " + message);
	}
}
