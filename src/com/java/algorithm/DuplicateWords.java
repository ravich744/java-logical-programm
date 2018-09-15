/*package com.java.algorithm;

import java.util.HashMap;

public class DuplicateWords {
	public static void main(String[] args) {
		String str= "I am am lirning am java java";
		String [] s=str.split(" ");
		HashMap<String,Integer> m=new HashMap<>();
		for(String temp:s) {
			if(m.get(temp)!=null) {
				m.put(temp, m.get(temp)+1);
			}else {
			m.put(temp,1);
			}
		}
		System.out.println(m);
	}
}*/
//===========================================================package com.java.algorithm;
package com.java.algorithm;
import java.util.HashMap;
import java.util.Iterator;

public class DuplicateWords {
	
	public static void main(String[] args) {
		String str= "I am am lirning am java java";
		String [] s=str.split(" ");
		HashMap<String,Integer> m=new HashMap<>();
		for(String temp:s) {
			if(m.get(temp)!=null) {
				m.put(temp, m.get(temp)+1);
			}else {
			m.put(temp,1);
			}
		}
		/*Iterator<String> temp=m.keySet().iterator();
		while(temp.hasNext()) {
			String st=temp.next();
			if(m.get(st)>1) {
				System.out.println(st+" Appare "+m.get(st));
			}
		}*/
		Iterator<String> itr=m.keySet().iterator();
		while(itr.hasNext()) {
			String st=itr.next();
			if(m.get(st)>1) {
				System.out.println(st+" Appare "+m.get(st));
			}
		}
	}
}
//========================================================
/*package com.java.algorithm;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {
	
	public static void main(String[] args) {
		String str[]= {"I", "am", "lirning", "am", "java" ,"java","I"};
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					System.out.println("Duplicate element is ::"+str[j]);
				}
			}
		}
      //==================By Using Set================		
		Set<String> st=new HashSet<>();
		for(String name:str) {
			if(st.add(name)==false) {
				System.out.println("Duplicate Element Is ::"+name);
			}
		}
	}
}*/
