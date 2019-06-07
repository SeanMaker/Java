package programs;

public class test3 {
	class Weapen {
		String power="Strong";
		int sp=100;
				
	}

	class Tank extends Weapen{
		private String dir;
		public String getDir(String dir){
			this.dir=dir;
			return dir;
		}
		
		public void Attack(){
			System.out.println("I'm a Tank. I'm moving to "+this.dir+",Speed is "+super.sp+", Power is "+power);
		}
		
	public void main(String[] args){
			Weapen w1=new Weapen();

			Tank t1=new Tank();
			t1.getDir("North");
			t1.Attack();
		}
}
}