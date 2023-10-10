package Operators;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int l=sc.nextInt();
		System.out.println("Enter the breadth");
		int b=sc.nextInt();
		double area=l*b;
		System.out.println("Area of Rectangle is"+ " "+area);


	}

}
