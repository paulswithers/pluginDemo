package com.paulwithers.iconuk.demoPlugin;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DemoUtils {

	public static String convertObjectToString(final Object o) {
		String retVal_ = "";
		try {
			retVal_ = AccessController.doPrivileged(new PrivilegedExceptionAction<String>() {
				public String run() throws Exception {
					return ReflectionToStringBuilder.toString(o);
				}
			});
		} catch (AccessControlException e) {
			e.printStackTrace();
		} catch (PrivilegedActionException e) {
			e.printStackTrace();
		}
		return retVal_;
	}
}
