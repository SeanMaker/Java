package programs;

import java.util.Scanner;


public class ComputerArea {
	public static void main(String[] args){
		double radius,area;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter the radius: ");
		radius=input.nextDouble();
		area=radius*radius*Math.PI;
		System.out.println("The result is: "+ area);
	}

}
