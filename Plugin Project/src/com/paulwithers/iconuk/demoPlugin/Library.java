package com.paulwithers.iconuk.demoPlugin;

import com.ibm.xsp.library.AbstractXspLibrary;

public class Library extends AbstractXspLibrary {
	private final static String LIBRARY_ID = Library.class.getName();
	// change this string to establish a namespace for your resources:
	public final static String LIBRARY_RESOURCE_NAMESPACE = "IconUk";
	public final static String LIBRARY_BEAN_PREFIX = "IconUk";
	private final static boolean _debug = Activator._debug;

	static {
		if (_debug) {
			System.out.println("Loading " + Library.class.getName());
		}
	}

	public Library() {
		if (_debug) {
			System.out.println("Created " + Library.class.getName());
		}
	}

	public String getLibraryId() {
		return LIBRARY_ID;
	}

	@Override
	public String getPluginId() {
		return Activator.PLUGIN_ID;
	}

	@Override
	public String[] getDependencies() {
		return new String[] { "com.ibm.xsp.core.library", "com.ibm.xsp.extsn.library", "com.ibm.xsp.domino.library",
				"com.ibm.xsp.designer.library" };
	}

	@Override
	public String[] getXspConfigFiles() {
		String[] files = new String[] {};

		return files;
	}

	@Override
	public String[] getFacesConfigFiles() {
		String[] files = new String[] {};
		return files;
	}

	@Override
	public boolean isGlobalScope() {
		return false;
	}
}
