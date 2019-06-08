import java.lang.Thread;

public class L6_1 {
	
public static void main(String[] args){
	Xc xc=new Xc();
	xc.start();
	
	for(int i=0;i<200;i++){
		System.out.println("Sharon");
	}
}
	
	
	

}


class Xc extends Thread{//创建线程所需要继承的类
	public void run()//run方法是覆盖的父类方法
	{
		for(int i=0;i<200;i++){
			System.out.println("Madeleine");
		}
	}
}