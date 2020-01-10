package Java_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reverse_String {
	@Test
public void reverseString(){
	String s1="Dad";
	int n=s1.length();
	for(int i=n-1;i>=0;i--)
	{
		
		System.out.print(s1.charAt(i));
	}
System.out.println();
	}
	
	
	
	
	
}
