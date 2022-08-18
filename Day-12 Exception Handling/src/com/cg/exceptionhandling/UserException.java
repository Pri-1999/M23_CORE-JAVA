package com.cg.exceptionhandling;

@SuppressWarnings("serial")
class CustomException extends Exception
{
	private int detail;
	//parameterized Constructor
	public CustomException(int detail)
	{
		super();
		this.detail=detail;
	}
	public CustomException(String message)
	{
		super (message);
	}
	public String toString()
	{
		return "CustomException[detail="+ detail +"]";
	}
}

public class UserException
{
	static void accept(int a)throws CustomException
	{
		System.out.println(" Called Compute:");
		if(a>10)
			throw new CustomException(a);
		System.out.println("No Exception");
	}

	public static void main(String[] args) 
	{
		try
		{
			accept(11);
		}
		catch(CustomException e)
		{
			System.out.println("Priyanka"+e);
		}
	}

}
