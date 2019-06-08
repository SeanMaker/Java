
public class L6_7_Pblock {
	public static void main(String[] args){
		Xc7 xc7=new Xc7();
		Thread a=new Thread(xc7);
		a.start();
		
		try {
			a.join();//阻塞时将当前的线程暂停，将调用join函数的线程执行完毕后，才继续执行后面的线程
		} catch (Exception e) {}
		
		for(int i=0;i<30;i++){
			System.out.println("Main_Thread:"+i);
		}
	}

}



class Xc7 implements Runnable{
	public void run(){
		for(int i=0;i<30;i++){
			System.out.println("Dive_Thread:"+i);
		}
	}
}