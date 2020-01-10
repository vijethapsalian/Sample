package Practise;

public class Bubble {
public static void main(String[] args) {
	int[] arr={20,10,5,30,15};
	int n=arr.length;
	for(int j=0;j<n;j++)
	{
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int t=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=t;
			}
		}
	}
	for(int j=0;j<n;j++)
	{
		System.out.print(arr[j]+" ");
	}
	
	
	
}
}
