package Java_programs;

import java.util.HashMap;

public class String_count {
public static void main(String[] args) {
	String[] arr={"hi","hello","bye","gdnt","hi","hello"};
	HashMap<String, Integer> h=new HashMap<String, Integer>();
	for(int i=0;i<arr.length;i++)
	{
	if(h.containsKey(arr[i]))
	{
		Integer x = h.get(arr[i]);
		x++;
		h.put(arr[i], x);
	}
	else
	{
		h.put(arr[i], 1);
	}
}
	
System.out.println(h);	
}	
}
