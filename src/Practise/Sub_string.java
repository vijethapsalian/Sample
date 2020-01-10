package Practise;

public class Sub_string {
public static void main(String[] args) {
	String s1="hellohibye";
	System.out.println(s1.substring(2, 6));
	String s2 = "hi";
	s2=s2+"bye";
	String s3="hibye";
			System.out.println(s2==s3);
String s4="java mava is of java";
String[] s = s4.split(" ");
int count=0;
String f = "java";
for(int i=0;i<s.length;i++)
{
	if(s[i]==f)
	{
		count++;
	}
}
System.out.println(count);
}
}
