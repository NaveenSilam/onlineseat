package com.exceptionfiles;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int arr[]= {10,20,30,40,50};
	System.out.println(arr[3]);
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("this is array index boundary");
}
catch(Exception e) {
	System.out.println("some other error");
}
	}

}
