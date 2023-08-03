package com.cg.model;

public class BankAccount 
{
	public Double Withdraw(Double Total,Double withdraw)
	{
		//Double RemainingBalance;
		if(Total<withdraw)
		{
			throw new IllegalArgumentException("Insufficients Funds");
		}
		return Total-withdraw;
	}
}