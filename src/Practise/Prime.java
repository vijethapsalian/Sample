package Practise;

public class Prime {
public static void main(String[] args) {
	int no=22;
	Boolean flag=true;
	for(int i=2;i<no;i++)
	{
		if(no%i==0)
		{
			flag=false;
		}
	}
if(flag==true)
{
	System.out.println(no+" is a prime number");
}
else
{
	System.out.println("Not a prime number");
}

}
}
