package com.String;

public class additiondigitString {
	
	public static void main(String[] args) {
		
		String s = "He110 45a11";
		int result = 0;
		
		for(int i=0;i<s.length(); i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				result = result+Integer.parseInt(s.charAt(i)+"");
			}
		}
		System.out.println("Result : "+result);
	}

}