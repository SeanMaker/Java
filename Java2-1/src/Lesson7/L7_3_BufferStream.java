package Lesson7;

import java.io.*;

public class L7_3_BufferStream {
	public static void main(String[] args) throws Exception{
			BufferedInputStream input=new BufferedInputStream(new FileInputStream("C:/Users/sdong/Desktop/mp3/Closer.m4a"));
			BufferedOutputStream output=new BufferedOutputStream(new FileOutputStream("C:/Users/sdong/Desktop/mp3/456.m4a"));
			
			byte[] bt=new byte[2048];//缓冲区大小，单位是字节
			int aa;
			aa=input.read(bt);
			
			while(aa!=-1){
				output.write(bt,0,aa);//最后一次写入可能不满2048，预防出错
				aa=input.read(bt);
			}
	
			output.flush();
			
			input.close();
			output.close();
	}
	

}
