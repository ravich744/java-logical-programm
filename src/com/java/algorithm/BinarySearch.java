package com.java.algorithm;

public class BinarySearch {
	
	public static void main(String[] args) {
		int []a= {12,13,14,15,22,34,56,77};
		int key=56;
		int result=binartSearch(a,key);
		if(result!=-1) {
			System.out.println(key+" Is present in index :"+result);
		}else {
			System.out.println(key+" Is Not present in Index :");
		}
	}

	private static int binartSearch(int[] a, int key) {
		int first=0;
		int last=a.length-1;
		for(int i=0;i<a.length;i++) {
			int mid=(first+last)/2;
			if(a[mid]==key) {
				return mid;
			}
			if(a[i]>key) {
				first=mid-1;
			}
			if(a[i]<key) {
				first=mid+1;
			}
		}
		return 0;
	}
}
