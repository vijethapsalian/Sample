package Practise;

public class Prime_100 {
public static void main(String[] args) {
	
	for(int j=2;j<=100;j++)
	{
		Boolean flag=true;
		for(int i=2;i<j;i++)
		{
			if(j%i==0)
			{
				flag=false;
			}
		}
	if(flag==true)
	{
		System.out.println(j);
	}
		
	}
}
}

