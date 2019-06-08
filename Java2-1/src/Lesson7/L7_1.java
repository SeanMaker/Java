package Lesson7;
import java.io.*;


public class L7_1 {
	public static void main(String[] args) throws Exception{
		FileReader file=new FileReader("D:/Java Program/Java2-1/src/Lesson7/L7_1.java");
		
		int aa;
		aa=file.read();
		System.out.println("The content of file is: ");
		while(aa!=(-1)){
			System.out.print((char)aa);
			aa=file.read();
		}
		file.close();
	}

}
