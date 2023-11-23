package com.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		String s = "H311o Te5tin9 5hastra";
		Pattern p = Pattern.compile("\\d"); // \d digits \w words
		Matcher m = p.matcher(s);

		int result = 0;

		while (m.find()) {

			result = result + Integer.parseInt(m.group());
		}
		System.out.println("Result: "+ result);
	}

}
