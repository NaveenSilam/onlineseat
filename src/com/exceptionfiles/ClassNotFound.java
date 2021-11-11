package com.exceptionfiles;

public class ClassNotFound {
	private static final String CLASS_TO_LOAD="CheckedException.Prism";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class loadedclass=Class.forName(CLASS_TO_LOAD);
	System.out.println(loadedclass+"found successfully");
}catch(Exception e){
		e.printStackTrace();
	
}
	}

}
