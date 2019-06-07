package programs;

public class C extends number{
	private int j;
	
	C(int j){
		super(j);
		this.j=j;
	}
	
	public boolean equals(number t1){
		C new_c=(C)t1;
		if(this.j==new_c.j){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	

}
