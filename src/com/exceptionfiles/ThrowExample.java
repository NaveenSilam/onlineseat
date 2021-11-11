package com.exceptionfiles;

public class ThrowExample {
static void checkEligibity(int age) {
	if(age<18) {
		throw new ArithmeticException("person is not eligible for voting");
	}
	else {
		System.out.println("person is eligible for voting");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("welcome to the registration process");
checkEligibity(19);
System.out.println("have a nice day");

	}
	
	}


