package Practise;

public class A_pattern {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if((i==4)||(j==1&&i!=1)||(j==5&&i!=1)||(i==1&&j!=1&&j!=5))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
	System.out.println();
		System.out.println();
		System.out.println();
	}
	
	
	
}
}
