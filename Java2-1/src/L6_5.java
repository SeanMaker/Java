class Xc5_1 implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
		System.out.println(Thread.currentThread().getName()+":"+i);
		
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	}
}
public class L6_5 {
	public static void main(String[] args){
		
	Thread xc1=new Thread(new Xc5_1());
	xc1.start();
	
	}
}
