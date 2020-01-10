package Singleten_design;

class Sample
{
	int a=10;
	static Sample s1;
	static int count=0;
	private Sample()
	{
		count++;
	}
	
	static Sample getInstance()
	{
if(count<1)
{
			s1=new Sample();
}
		return s1 ;
	}
	static void setInstance(int y)
	{
		s1.a=y;
	}
	
}


public class Singleten {
public static void main(String[] args) {
	Sample s2=Sample.getInstance();
	System.out.println(s2.a);
Sample s3=Sample.getInstance();
System.out.println(s3.a);
Sample s4=Sample.getInstance();
Sample.setInstance(20);
System.out.println(s3.a);
System.out.println(s2==s3);
System.out.println(s3==s4);
}
}
