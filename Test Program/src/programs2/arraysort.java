package programs2;

import java.util.Arrays;
import java.util.Scanner;

public class arraysort {
	
	public static void main (String[] args) {
		
		/*Scanner in= new Scanner(System.in);
		int [] grades=new int[4];
		
		
		for(int i=0;i<grades.length;i++){
		System.out.println("Please enter the grade:");
		grades[i]=in.nextInt();
		}
		
		Arrays.sort(grades);
		
		for(int i=0;i<grades.length;i++){
			System.out.println(grades[i]);
			}
		*/
		
		
		/*Scanner in= new Scanner(System.in);
		String [] alpht=new String[4];
		
		for (int i= 0; i<alpht.length;i++){
			System.out.println("Please enter the charactor:");
			alpht[i]=in.next();
				
		}
		Arrays.sort(alpht);
		
		for (int i=alpht.length-1; i>=0;i--){
			System.out.println(alpht[i]);
		}
		*/
		/*
		int [] arrA={1,2,3,4,5,6,7,8,9};
		int [] arrB=new int[arrA.length];
		for(int i=0; i<arrA.length;i++){
			
			arrB[i]=arrA[i];
		}
		
		for(int i=0; i<arrA.length;i++){
			
			System.out.print(arrB[i]);
		}
		*/
		
		/*Scanner in= new Scanner(System.in);
		String [] name={"Sharon","Grace","Kelvin","Madeleine","Jason"};
		boolean flag=false;
		
		System.out.print("Please enter student name who you want to find:");
		String search_name=in.next();
		
		for (int i=0;i<name.length;i++){
			if (search_name.equals(name[i])){
				flag=true;
				break;
			}
		}
		
		if (flag==true){
			System.out.print("Find it.");
		}
		else{
			System.out.print("Can not find it.");
		}
*/
		
		/*
		int [] array={1,9,43,50,80,99};
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number you want to insert:");
		int number=in.nextInt();
		
		array[array.length-1]=number;
		
		for(int i=array.length-1; i>0; i--){
			if (array[i]<array[i-1]){
				int temp=array[i];
				array[i]=array[i-1];
				array[i-1]=temp;
				
			}
			else{
				break;
			}
		for (int j=0; j<array.length;j++){
		System.out.println(array[j]);
		}
		}
		*/
		
		/*int [] array={12,20,18,55,43,50,99,80};
		
		for (int j=0;j<array.length-1;j++){
		for (int i=0; i<array.length-1;i++){
			if(array[i]<array[i+1]){
				int temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		}
		
		for(int k=0; k<array.length;k++){
		System.out.print(array[k]+" ");
		}
		//冒泡排序
		*/
		
		int [] array={12,20,18,55,43,50,99,80};
		for (int i=0; i<array.length-1;i++){
		for(int j=i+1;j<array.length;j++){
			if (array[i]>array[j]){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
		}
		
		for(int k=0; k<array.length;k++){
		System.out.print(array[k]+" ");
	}
	}
}
