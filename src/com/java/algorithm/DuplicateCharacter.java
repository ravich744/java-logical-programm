/*package com.java.algorithm;

import java.util.HashMap;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String s= "ravdgshdtfwgdgefe";
		HashMap<Character,Integer> m=new HashMap<>();
		for(int i=0;i<s.length()-1;i++) {
			//char st=s.charAt(i);
			if(m.get(s.charAt(i))!=null) {
				m.put(s.charAt(i),m.get(s.charAt(i))+1);
			}else {
				m.put(s.charAt(i),1);
			}
		}
		System.out.println(m);
	}
}*/
//=========================================================
package com.java.algorithm;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String s= "ravdgshdtfwgdgefeooooooooo";
		HashMap<Character,Integer> m=new HashMap<>();
		for(int i=0;i<s.length()-1;i++) {
			if(m.get(s.charAt(i))!=null) {
				m.put(s.charAt(i),m.get(s.charAt(i))+1);
			}else
				m.put(s.charAt(i),1);
		}
		
		/*Iterator<Character> itr=m.keySet().iterator();
		while(itr.hasNext()) {
			Character st=itr.next();
			if(m.get(st)>1) {
				System.out.println(st+"--> Appare :"+m.get(st));
			}
		}*/
		System.out.println(m);
	}
}
