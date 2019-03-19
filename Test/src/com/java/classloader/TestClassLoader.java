package com.java.classloader;

import java.util.ArrayList;

import com.sun.nio.zipfs.ZipPath;

public class TestClassLoader {
	public static void main(String[] args) {
		System.out.println("String : " + String.class.getClassLoader());
		System.out.println("TestClassLoader : " + TestClassLoader.class.getClassLoader());		
		System.out.println("ZipPath : " + ZipPath.class.getClassLoader());
		System.out.println("ArrayList : " + ArrayList.class.getClassLoader());
		System.out.println("System properties : "+ System.getProperty("java.ext.dirs"));
	}
}
