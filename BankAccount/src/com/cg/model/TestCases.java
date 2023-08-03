package com.cg.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {
	@Test
	public void test() {
		BankAccount bank=new BankAccount();
		Double expected=5000.00;
		try {
			assertEquals(expected,bank.Withdraw(10000.00,20000.00));
		} catch (InsufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test1() {
		BankAccount bank=new BankAccount();
		Double expected=10000.00;
		try {
			assertEquals(expected,bank.Withdraw(30000.00,20000.00));
		} catch (InsufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test2() {
		BankAccount bank=new BankAccount();
		/*Double expected=4000.00;
		try {
			assertEquals(expected,bank.Withdraw(10000.00,2000.00));
		} catch (InsufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		assertThrows(InsufficientException.class, () -> bank.Withdraw(30000.00,20000.00));
}
}