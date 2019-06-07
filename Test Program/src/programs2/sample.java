package programs2;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class sample {
	public static void main(String[] args){
	/*int[] a= new int[5];
	a[0]=80;
	for (int i=0; i<=4;i++){
	System.out.println(a[i]);
	}
 */
		/*Scanner in=new Scanner(System.in);
	System.out.println("Please enter the Fehrenheit degree:");
	double FD=in.nextDouble();
	
	double HD=(5.0/9)*(FD-32);
	System.out.println("The Celsius degree is:"+ HD);
	}*/
		
	/*long millisecond=System.currentTimeMillis();
	long second=((millisecond/1000)%60);
	long minutes=((millisecond/1000/60)%60);
	long hours=((millisecond/1000/60/60-5+1)%24);
	System.out.println(hours+":"+minutes+":"+second);
	
	}	*/
		/*JOptionPane.showMessageDialog(null, "欢迎 Welcome","\u6B22\u8FCE",JOptionPane.ERROR_MESSAGE);*/
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Please enter the amount of money:");
		
		double total=in.nextDouble();
		int totalpenny=(int)(total*100);
		int dollars=totalpenny/100;
		int quarter=totalpenny%100;
		int dimes=((totalpenny%100)%25)/10;
		int nickels=(((totalpenny%100)%25)%10)/5;
		int pennys=(((totalpenny%100)%25)%10)%5;
		
		System.out.println("Dollars:"+dollars);
		System.out.println("Quarter:"+quarter);
		System.out.println("Dimes:"+dimes);
		System.out.println("Nickels:"+nickels);
		System.out.println("Pennys:"+pennys);
		
		
		
	}
}
