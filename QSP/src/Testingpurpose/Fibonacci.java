package Testingpurpose;

public class Fibonacci {

	public static void main(String[]args) 
	{
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=10;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}// TODO Auto-generated method stub

	}


