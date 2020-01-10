package Java_programs;

import org.testng.annotations.Test;

public class Bubble_sort {
@Test
public void sort()
{
	int arr[]={10,80,32,-1,0,0};
	int n=arr.length;
	for(int j=0;j<n;j++)
	{
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				int t=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=t;
			}
		}
	}
	for(int j=0;j<n;j++){
	System.out.println(arr[j]);	
}
}
}

