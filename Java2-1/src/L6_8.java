//线程同步


public class L6_8 {
	public static void main(String[] Args){
		
		Xc8 xc8_1=new Xc8();
		Thread ee=new Thread(xc8_1);
		ee.setName("NewYork");
		ee.start();
		
		
		Thread ff=new Thread(xc8_1);
		ff.setName("Bostong");
		ff.start();
	}
}

class Xc8 implements Runnable{
	
	public static int ticket=100;
	String ss=new String("a"); //定义在函数外，字符串随意定义
	
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
