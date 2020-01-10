package Checked_Exception;

class AgeException extends Exception
{
	String msg;
	AgeException(String msg)
	{
		this.msg=msg;	
	}
	public String getMessage()
	{
		return msg;
	}	
}

class Voting
{
	public static void ageLimit() throws AgeException
	{
		int age=15;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new AgeException("Not eligible to vote");
		}
	}

public static void main(String[] args) {

		try {
			Voting.ageLimit();
		} catch (AgeException e) {
			
	System.out.println(e.getMessage());
		}
}
}

