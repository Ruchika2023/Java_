package Operators;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int x=40;
		int y=45;
		if(++x<40 && ++y>45)
		{
			x++;
		}
		else {
			y++;
		}
		System.out.println(x);
		System.out.println(y);
	}
	

}
