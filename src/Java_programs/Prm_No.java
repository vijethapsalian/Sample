package Java_programs;

import java.util.Scanner;

public class Prm_No {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	System.out.println();
	int x = s.nextInt();
	//int x=20;
	boolean flag=true;
	for(int i=2;i<x;i++)
	{
		if(x%i==0)
		{
			flag=false;
		}
	}
	if(flag==true){
		System.out.println(x+" is a prime number");
	}else
	{
		System.out.println(x+" Not a prme no.");
	}
}
	
}
