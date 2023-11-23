package com.String;

import java.util.Scanner;

public class Palin3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String to check Palindrome");

		String original = sc.next();

		if(original.equals(new String(new StringBuffer(original).reverse())))
			
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Plindrome");
	}
}
