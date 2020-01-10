package Practise;

public class Perfect_No {
public static void main(String[] args) {
	int no=28;
	int sum=0;
	for(int i=1;i<=14;i++)
	{
		if(no%i==0)
		{
			sum=sum+i;
		}
	}
System.out.println(sum);
}
}
