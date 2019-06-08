
import java.lang.*;

public class L6_2 {
	
public static void main(String[] args){
	Xc2 xc2=new Xc2();
	Thread thread=new Thread(xc2);
	thread.start();
	
	for(int i=0;i<200;i++){
		System.out.println("Sharon");
	}
}
	
	
	

}


class Xc2 implements Runnable{//不是继承类，而是实现接口，功能更强大一点
	public void run()
	{
		for(int i=0;i<200;i++){
			System.out.println("Madeleine");
		}
	}
}