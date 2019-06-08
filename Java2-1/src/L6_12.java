class Storage{
	private char[] amount=new char[8];
	private int product=0;
	
	public synchronized void production(char aa){
		while(product==amount.length){
			
			try {
				this.wait();
			} catch (Exception e) {}
			}
		
		this.notify();
		
		amount[product]=aa;
		++product;
		
		System.out.println("The line is producing No."+product+" production.");
	}
	
	public synchronized void consumption(){
		char aa;
		
		while(product==0){
			try {
				this.wait();
			} catch (Exception e) {}
			
			}
		this.notify();
		aa=amount[product-1];
		
		System.out.println("The line is consuming No."+product+" production.");
		
		--product;
		
	}
}

class Production implements Runnable{
	private Storage pd=null;
	
	public Production(Storage pd){
		this.pd=pd;
	}
	
	public void run(){
		char aa;
		for (int i=0;i<26;i++){
			aa=(char)('A'+i);
			pd.production(aa);
		}
	}
}

class Consumption implements Runnable{
	private Storage xc=null;
	public Consumption(Storage xc){
		this.xc=xc;
		
	}
	
	public void run(){
		
		for(int i=0;i<26;i++){
			xc.consumption();
		} 
	}
}




public class L6_12 {
	public static void main(String[] Args){
		Storage sr=new Storage();
		Production pc=new Production(sr);
		Consumption cs=new Consumption(sr);
		
		Thread thread_1=new Thread(pc);
		thread_1.start();
		
		Thread thread_2=new Thread(cs);
		thread_2.start();
	}
}
