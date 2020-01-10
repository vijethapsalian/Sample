package Java_programs;

public class length {
public static void main(String[] args) {
	String s = "hello";
	int count=0;
	char[] arr = s.toCharArray();
	for(char c:arr)
	{
		count++;
	}
	System.out.println(count);
	
}
}
