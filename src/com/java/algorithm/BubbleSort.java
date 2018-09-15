package com.java.algorithm;

public class BubbleSort {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,4,7,5,8};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i; j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int x:a) {
			System.out.print(" "+x);
		}
	}
}
