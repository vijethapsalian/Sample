package Java_programs;

import org.testng.annotations.Test;

public class Palindrome {
@Test
public void palinDrome()
{
String s1="Malayalam";
String s2="";
int n=s1.length();
for(int i=n-1;i>=0;i--)
{
	s2=s2+s1.charAt(i);
}
if(s2.equals(s1))
{
	System.out.println(s2+" is a palindrome");
}
else
{
	System.out.println(s2+" is not a palindrome");
}

}
}
