package com.github.lukfor.nf.test.util;

import java.io.File;
import java.nio.file.Path;

import groovy.lang.Closure;

public class FileAndPathMethods {

	public static File file(String filename) {
		return new File(filename);
	}

	public static Path path(String filename) {
		return Path.of(filename);
	}
	
	public static void with(Object context, Closure closure) {
		closure.setDelegate(context);
		closure.setResolveStrategy(Closure.DELEGATE_FIRST);
		closure.call();
	}
}
