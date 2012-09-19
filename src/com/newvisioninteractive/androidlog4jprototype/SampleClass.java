package com.newvisioninteractive.androidlog4jprototype;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.log4j.Logger;

public class SampleClass {

	private final Logger log = Logger.getLogger(SampleClass.class);

	public void testLog() {
		log.debug("test test!");
	}

	public void testException() {
		
		try {
			File foo = new File("foo");
			InputStream in = new FileInputStream(foo);
		} catch( FileNotFoundException e ) {
			log.error("test exception!", e);
		}
		
	}
}
