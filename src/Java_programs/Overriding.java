package Java_programs;
class Flipkart2
{
	void buyNow()
	{
		System.out.println("hello");
	}                                                                                                                                       
}


class Flipkart1 extends Flipkart2
{
	void buyNow()
	{
			System.out.println("Buying differetnt things");
	
		super.buyNow();
			
	}                                                                                                                                       
}

class Kurties1 extends Flipkart
{
	 void buyNow()
	{
		System.out.println("Buy kurtie");
		super.buyNow();
	}
}
public class Overriding {
	public static void main(String[] args) {
		Kurties1 k=new Kurties1();
	          k.buyNow();
	}

}
