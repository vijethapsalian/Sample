package Practise;

public class Count_char_A {
public static void main(String[] args) {
	char[] arr={'A','B','A','C','A'};
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]=='A')
		{
			count++;
		}
	}
System.out.println("A is repeated "+count+" times");
}
}
