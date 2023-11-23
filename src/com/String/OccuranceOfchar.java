package com.String;

import java.util.Scanner;

public class OccuranceOfchar {

	public static void main(String[] args) {

		String str = "i love india";

		str = str.replaceAll(" ", "");

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			count = 0;
			char ch = str.charAt(i);

			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);

				if (j < i && ch == c) {

					break;
				}
				if (ch == c) {

					count++;
				}
			}
			if (count != 0) {
				System.out.println("char " + ch + " Found number of times " + count);
			}
		}
	}
}
