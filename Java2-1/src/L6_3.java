

class Xc3 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}

public class L6_3 {
	public static void main(String[] args){
		Xc3 xc3=new Xc3();
		xc3.setName("Madeleine");
		xc3.start();
		
		Xc3 xc4=new Xc3();
		xc4.setName("Linda");
		xc4.start();
		
		Xc3 xc5=new Xc3();
		xc5.setName("OK");
		xc5.start();
		
		System.out.println(Thread.currentThread().getName()+" is running");
	}

}
