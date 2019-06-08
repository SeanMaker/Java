
public class L6_6 {
	
	public static void main(String[] args){
		Xc6 xc6=new Xc6();
		Thread aThread=new Thread(xc6);
		Thread bThread=new Thread(xc6);
		
		aThread.setName("Thread_1");
		bThread.setName("Thread_2");
		
		aThread.start();
		bThread.start();
		
	}

}


class Xc6 implements Runnable{
	public void run(){
		for(int i=1;i<=30;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			if(i%5==0){
				Thread.yield();//进程的让步
			}
		}
	}
}
