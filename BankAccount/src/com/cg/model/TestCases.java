package com.cg.model;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestCases {
	
	@Test 
	@DisplayName("InCorrect Value")
	public void test() {
		BankAccount bank=new BankAccount();
		Double expected=10000.00;
		assertEquals(expected,bank.Withdraw(20000.00,10000.00));
		
	}
	
	@Test
	@DisplayName("Correct Value")
	public void test1() {
		BankAccount bank=new BankAccount();
		Double expected=10000.00;
		assertEquals(expected,bank.Withdraw(30000.00,20000.00));
	}
	
	@Test
	@DisplayName("Exception")
	public void test2() {
		BankAccount bank=new BankAccount();
		assertThrows(IllegalArgumentException.class, () -> { 
			bank.Withdraw(30000.00,40000.00);
			});
	}
}