
class Xc4_1 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
		System.out.println("1_Thread:"+i);
	}
	}
}

class Xc4_2 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
		System.out.println("2_Thread:"+i);
	}
	}
}



public class L6_4 {
	public static void main(String[] args){
		Thread xc1=new Thread(new Xc4_1());
		Thread xc2=new Thread(new Xc4_2());
		xc2.setPriority(Thread.NORM_PRIORITY+3);
		xc1.start();
		xc2.start();
		
		
	}

}
