package Testingpurpose;

public class Prime
{

	public static void main(String[]args) 
	{
		int no=6;
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("It is a Prime");
		}
		else
		{
			System.out.println("Prime no");
		}
		
		}
		// TODO Auto-generated method stub


}