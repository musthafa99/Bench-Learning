package com.cg.model;

class InsufficientException extends Exception
{
	public InsufficientException(String msg)
	{
		super(msg);
	}
}
public class BankAccount 
{
	public Double Withdraw(Double Total,Double withdraw) throws InsufficientException
	{
		//Double RemainingBalance;
		if(Total<withdraw)
		{
			throw new InsufficientException("Insufficients Funds");
		}
		return Total-withdraw;
	}
}