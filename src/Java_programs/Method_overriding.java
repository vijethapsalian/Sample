package Java_programs;
class Flipkart
{
	void buyNow()
	{
		System.out.println("Buying differetnt things");
	}                                                                                                                                       
}

class Kurties extends Flipkart
{
	void buyNow()
	{
		System.out.println("Buy kurtie");
	}
}

class Palaso extends Flipkart
{
	void buyNow()
	{
		System.out.println("Buy Palaso");
		
	}
}

class Stimulator
{
	static void ansim(Flipkart f)
	{
		f.buyNow();
	}
}


public class Method_overriding {
	public static void main(String[] args) {
		Kurties k=new Kurties();
		Palaso p=new Palaso();
		Stimulator.ansim(k);
		Stimulator.ansim(p);
		
	}
	
	

}
