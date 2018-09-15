/*package com.java.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateInArray {
	public static void sort(int[]a) {
	List<Integer> l=new ArrayList<>();
		for(int i:a) {
			l.add(i);
		}
		Set<Integer> s=new HashSet<>(l);
		for(Integer itr:s) {
			System.out.print(itr+" ");
		}
	 }
	public static void main(String[] args) {
		int []a= {2,4,2,6,4,3,7,3,5,3,2,5,3,4,4,22,3,3,3,3,2};
		sort(a);
	}
 } */
//=====================================================
/*package com.java.algorithm;

import java.util.Arrays;

public class RemoveDuplicateInArray {
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {10,70,30,90,20,20,30,40,70,50};//unsorted array  
        Arrays.sort(arr);//sorting array  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
	}
 }*/
//===========================================================package com.java.algorithm;
package com.java.algorithm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateInArray {
	private static void sort(int[] a) {
		List<Integer> l=new ArrayList<>();
		for(int i:a) {
			l.add(i);
		}
		Set<Integer> s=new HashSet<>(l);
		for(int j:s) {
			System.out.print(j+" ");
		}
	}
	
	public static void main(String[] args) {
		int []a= {2,4,2,6,4,3,7,3,5,3,2,5,3,4,4,22,3,3,3,3,2};
		sort(a);
	}
 } 