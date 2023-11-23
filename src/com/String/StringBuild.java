package com.String;

public class StringBuild {

	/**
	 * StrinBuilders are mutable Stringbuilder can create using new keyword only Not
	 * synchronized and not thread safe as well Synchronized - the capability to
	 * control the access of multiple threads to any shared resource.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hello");

		sb.append(" Testing Shastra");

		System.out.println("Using Strinbuilder : " + sb);
	}
}
