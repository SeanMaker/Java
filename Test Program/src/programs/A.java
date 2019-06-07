package programs;

import java.util.Scanner;

public class A {
	void  a() throws Exception{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=a%b;
		System.out.println("The remainder is "+c);
	}

}
