
package com.String;

import java.util.Scanner;
	
public class Palin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to check Palindrome");
		
		String original = sc.next();

		String reverseStr = "";

		for (int i = (original.length()- 1); i >= 0; i--) {
			
			reverseStr = reverseStr + original.charAt(i);
			
		}

		if (original.equals(reverseStr)) {
			System.out.println(original + " is a Palindrome String.");
		} else {
			System.out.println(original + " is not a Palindrome String.");
		}
	}

}
