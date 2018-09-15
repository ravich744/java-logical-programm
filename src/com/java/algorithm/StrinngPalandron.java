/*package com.java.algorithm;

public class StrinngPalandron {
	
	public static void main(String[] args) {
		String reverce="";
		String original="lol";
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverce=reverce+original.charAt(i);
		}
		if(original.equals(reverce)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
}*/
//==========================Using method================================
/*package com.java.algorithm;

public class StrinngPalandron {
	 public static void chechPalandrom(String s) {
		 String r=new StringBuffer(s).reverse().toString();
		 if(s.equals(r)) {
			 System.out.println("yes");
		 }else {
			 System.out.println("No");
		 }
	 }
	public static void main(String[] args) {
		chechPalandrom("dfgh");
	}
}*/
//===================================================================
package com.java.algorithm;

public class StrinngPalandron {
	
	public static void main(String[] args) {
		int n=123241;
		int num=n,sum=0,r;
		while(n!=0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(num==sum) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
}
