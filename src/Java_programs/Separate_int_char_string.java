package Java_programs;

public class Separate_int_char_string {
public static void main(String[] args) {
	String s1="vi1j@19t4&*";
	String alpha="";
	String numeric="";
	String spec="";
	for(int i=0;i<s1.length();i++)
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
