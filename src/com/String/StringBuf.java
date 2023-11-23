package com.String;

public class StringBuf {

	/**
	 * StringBuffers are mutable Created by using new keyword only Synchronized and
	 * thread safe (1 thread can use execute at a time)
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		String s = "Hello";

		s.contains("Testing Shastra");

		System.out.println("Using String : " + s);

		StringBuffer sb = new StringBuffer("Hello");

		sb.append(" Testing Shastra");
		System.out.println("Using Stringbuffer : " + sb);
	}

}
