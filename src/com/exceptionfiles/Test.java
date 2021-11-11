package com.exceptionfiles;

public class Test {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
	}

	public int division(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
