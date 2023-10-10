package Operators;

public class Ternory1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=10;
 int b=20;
 int c=30,d=40,e=50;
 int max=(a>b && a>c && a>d && a>e)? a:
 (b>a && b>c && b>d && b>e)? b:
 (c>a && c>b && c>d && c>e)? c:
 (d>a && d>b && d>c && d>e)? d:e;
	 
	System.out.println(max);
	}

}
