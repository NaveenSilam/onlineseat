package com.exceptionfiles;

public class NullEqualCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hyderabad";
try {
	if("Hyderabad".equals(s))
		System.out.println("both are same");
	else
		System.out.println("both are not equal");
}
catch(NullPointerException e) {
	e.printStackTrace();
	System.out.println("NullPointer is caught");
}
	}

}
