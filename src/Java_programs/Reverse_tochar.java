package Java_programs;

public class Reverse_tochar {
public static void main(String[] args) {
	String s1="hello";
	String s2 = "";
	char[] arr = s1.toCharArray();
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(s2+arr[i]);
	}
}
}
