import java.lang.Thread;


public class L6_9 {
	
	public static void main(String[] Args){
		
		Xc9 xc8_1=new Xc9();
		xc8_1.setName("newYork");
		xc8_1.start();
		
		Xc9 xc8_2=new Xc9();
		xc8_2.setName("Bostong");
		xc8_2.start();
		

	}
}

class Xc9 extends Thread{
	
	public static int ticket=100;
	public static String ss=new String("a"); //定义在函数外，字符串随意定义
	
	public void run()
	{
		while(true)
		{
			synchronized (ss)//可用于修饰代码块，修饰函数时可直接用（不用定义字符串）
							//作用时让它所管辖的代码要么全部执行完，要么全部不执行
			{
				
			
			if (ticket>0)
			{
				System.out.println("The "+Thread.currentThread().getName()+" Station sold the No."+(101-ticket)+" Ticket.");
				--ticket;
			}
			else
			{
				break;
			}
			}
		}
	}
}
