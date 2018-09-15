/*package com.java.algorithm;

import java.util.HashMap;

public class AlternateCharactorCompare {
	public static void main(String[] args) {
		String a="googlegooglegreen";
		HashMap<Character,Integer> m=new HashMap<>();
		for(int i=0;i<a.length()-1;i++) {
			if(a.charAt(i)==a.charAt(i+1)) {
				if(m.containsKey(a.charAt(i))) {
					m.put(a.charAt(i), m.get(a.charAt(i))+1);
				}else {
					m.put(a.charAt(i),1);
				}
			}
		}
		System.out.print(m);
	}
}*/
//======================================================
package com.java.algorithm;

import java.util.HashMap;
import java.util.Iterator;

public class AlternateCharactorCompare {
	public static void main(String[] args) {
		String a="googlegooglooegreen";
		HashMap<Character,Integer> m=new HashMap<>();
		for(int i=0;i<a.length()-1;i++) {
			if(a.charAt(i)==a.charAt(i+1)) {
				if(m.containsKey(a.charAt(i))) {
					m.put(a.charAt(i),m.get(a.charAt(i))+1);
				}else
					m.put(a.charAt(i),1);
			}
		}
		Iterator<Character> itr=m.keySet().iterator();
		while(itr.hasNext()) {
			Character st=itr.next();
			System.out.println(st+" Repeated "+m.get(st));
		}
		System.out.println(m);
	}
}