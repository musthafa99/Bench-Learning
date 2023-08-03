package com.cg.model;

import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		Double Bankbalance=input.nextDouble();
		Double Withdraw=input.nextDouble();
		BankAccount bank=new BankAccount();
		try {
			System.out.println(bank.Withdraw(Bankbalance, Withdraw));
		} catch (InsufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*catch(InsufficientException e)
		{
				System.out.println(e.getMessage());
		}*/
		
		}

}
