package Lesson7;

import java.io.*;


public class L7_2_InputStream {
	public static void main(String[] args) throws Exception{
		FileInputStream file_i=new FileInputStream("C:/Users/sdong/Desktop/mp3/_20161216223924.mp4");
		FileOutputStream file_o=new FileOutputStream("C:/Users/sdong/Desktop/mp3/109.mp4");
		int aa;
		aa=file_i.read();
		while(aa!=(-1)){
			file_o.write(aa);
			aa=file_i.read();
		}
		
		file_o.flush();
		
		file_i.close();
		file_o.close();
	}

}

