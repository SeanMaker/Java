package programs;


public class Tank extends Weapen{
	private String dir;
	public String getDir(String dir){
		this.dir=dir;
		return dir;
	}
	
	public void Attack(){
		System.out.println("I'm a Tank. I'm moving to "+this.dir+",Speed is "+super.sp+", Power is "+power);
	}
}