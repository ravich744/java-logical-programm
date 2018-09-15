package com.java.algorithm;

public class ReplaceSpacleCharacter {
	public static void main(String[] args) {
		String text="hi ! - this -@ is Rva!i He#re";
		text=text.replaceAll("[^a-zA-Z0-9\\s+]","");
		System.out.print(text);
	}
}
