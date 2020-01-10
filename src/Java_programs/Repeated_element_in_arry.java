package Java_programs;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Repeated_element_in_arry {
	@Test
	public void countRepeats()
{
char[] arr={'A','b','a','A'};
int n=arr.length;
HashMap<Character, Integer> h=new HashMap<Character,Integer>();
for(int i=0;i<n;i++)
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
System.out.println(h.keySet());
	}
}
