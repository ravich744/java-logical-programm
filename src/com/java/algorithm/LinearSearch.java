package com.java.algorithm;

public class LinearSearch {
	public static void main(String[] args) {
		int []a= {2,5,3,4,7,9,8,10,1,16,21,33};
		int key=10;
		System.out.print(key +"Is present in index :"+linearSearch(a,key));
	}

	private static int linearSearch(int[] a, int key) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]==key) {
					return i;
				}
			}
		}
		return -1;
	}
}
