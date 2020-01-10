package Practise;

public class Without_length {
public static void main(String[] args) {
	int[] arr={10,20,30,40};
	int count=0;
	for(int c:arr)
	{
		count++;
	}
	System.out.println("Length is "+count);
	
	int i=0;
	try{
	while(i<=i)
	{
		int a = arr[i];
		i++;
	}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Length is "+i);
	}
	
	
	
}
}
