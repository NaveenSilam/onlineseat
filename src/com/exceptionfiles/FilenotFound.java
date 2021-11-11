package com.exceptionfiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file=new File("C:\\Users\\91966\\Desktop.doct");
try {
	FileReader fr=new FileReader(file);
}catch(FileNotFoundException e) {
	//System.out.println(FileReader +"file not found");
	e.printStackTrace();
}
/*catch(Exception e) {
	System.out.println("some where");
	}*/
	}
}
