package Practise;

public class Separate {
public static void main(String[] args) {
	String s1="v1@j2#gh1546$#$gy^HH";
	int n=s1.length();
	String alpha="";
	String numeric="";
	String spec="";
	for(int i=0;i<n;i++)
	{
		char ch = s1.charAt(i);
		if(Character.isAlphabetic(ch))
		{
			alpha=alpha+ch;
		}
		else if(Character.isDigit(ch))
		{
			numeric=numeric+ch;
		}
		else
		{
			spec=spec+ch;
		}
		
	}
System.out.println(alpha);
System.out.println(numeric);
System.out.println(spec);
}
}
