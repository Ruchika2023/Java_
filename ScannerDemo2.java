package Operators;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		int b=sc.nextInt();
		System.out.println("Enter the height");
		int h=sc.nextInt();
		double area=0.5*b*h;
		System.out.println("Area of triangle is"+ " "+area);

	}

}
