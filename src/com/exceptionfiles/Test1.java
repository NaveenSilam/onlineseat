package com.exceptionfiles;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test1 t=new Test1();
try {
	int i=t.division(10,0);
	System.out.println(i);
}catch(ArithmeticException e)
{
	throw new ArithmeticException("never divide by zero..");
}

	}

	private int division(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
