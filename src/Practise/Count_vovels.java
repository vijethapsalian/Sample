package Practise;

public class Count_vovels {
public static void main(String[] args) {
	int count=0;
	String s1="java&meva";
char[] s2 = s1.toCharArray();
	for(int i=0;i<s2.length;i++)
	{
		
		
		if(s2[i]=='a'||s2[i]=='e'||s2[i]=='i'||s2[i]=='o'||s2[i]=='u')
		{
			count++;
		}
	}
	System.out.println("no of vovels "+count);
	System.out.println("4th char is "+s1.charAt(4));
}
}
