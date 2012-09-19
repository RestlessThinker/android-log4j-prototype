package com.newvisioninteractive.androidlog4jprototype;

import java.io.File;

import org.apache.log4j.Level;

import android.os.Environment;
import de.mindpipe.android.logging.log4j.LogConfigurator;

public class ConfigureLog4J {
	
	public static void configure() {
		final LogConfigurator logConfigurator = new LogConfigurator();

		logConfigurator.setFileName(Environment.getExternalStorageDirectory()
				+ File.separator + "myapp.log");
		logConfigurator.setRootLevel(Level.DEBUG);
		// Set log level of a specific logger
		logConfigurator.setLevel("org.apache", Level.ERROR);
		logConfigurator.configure();
	}

}
