package Java_programs;

import java.util.Scanner;

public class table_2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	int x = s.nextInt();
	for(int i=1;i<=10;i++)
	{
	System.out.println(x+"*"+i+"="+(x*i));
}
	
}
}

