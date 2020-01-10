package Java_programs;
class Whatsapp
{
	void send(int no)
	{
		System.out.println("NUmber of sent messages "+no);
	}

void send(String msg)
{
	System.out.println("Message is"+msg);
}

void send(int no,String msg)
{
	System.out.println(no+" "+" "+msg);
}
}

public class Method_overloading {
	public static void main(String[] args) {
		Whatsapp w=new Whatsapp();
		w.send(5, "byeee");
		w.send(1);
		w.send(100);
		w.send("10");
	}

}
