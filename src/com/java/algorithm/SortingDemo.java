package com.java.algorithm;

import java.util.Arrays;

public class SortingDemo {
	public static void main(String[] args) {
		int []a= {1,3,5,2,4,3,6,8,5,8,9};
		Arrays.sort(a);
		for(int i:a) {
			System.out.print(" "+i);
		}
	}
}
