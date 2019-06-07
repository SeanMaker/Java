package programs;

public class number {
	private int i;
	number(int i){
		this.i=i;
	}
	
	public boolean equals(number t1){
		if(this.i==t1.i){
			return true;
		}
		else{
			return false;
		}
	}
}
