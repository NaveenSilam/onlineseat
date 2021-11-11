package com.exceptionfiles;

public class StringIndex {
public static void main(String args[]) {
	String s="Capgemini";
	try {
		char c=s.charAt(24);
		System.out.println(c);
		}catch(StringIndexOutOfBoundsException e) {
			
	
		System.out.println("String index range crossed" );
		e.printStackTrace();
	}catch(Exception e) {
		System.out.println("other exception");
	}
}
}
