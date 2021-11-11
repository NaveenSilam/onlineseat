package com.exceptionfiles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInputMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age=0;
		double salary=0.0;
		String name=" ";
		System.out.println("enter the details");
		try {
			age=s.nextInt();
			name=s.next();
			System.out.println("age:"+age +"salary:"+salary +"name:"+name);
			
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
catch(Exception e) {
	e.printStackTrace();
}
	}

}
