package programs;

public class L2_2 {
	public static void main(String[] args){
		A method_a=new A();
		try
		{
			method_a.a();
		}
		catch (Exception e){
			System.out.println("Wrong input!");
		}
		finally{
		System.out.println("Program is running!");
		}
	}
}
