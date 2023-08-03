package com.cg.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestBasicSalaryCalcualtor {
	
	public BasicSalaryCalculator basicsalarycalculator;
	
	@BeforeEach
	void init() {
		basicsalarycalculator = new BasicSalaryCalculator();
	}
	
	@Test
	@DisplayName("Test with Valid Number")
	void testBasicSalarywithvalidNumber() {	
		double basicSalary = 8000;
		basicsalarycalculator.setBasicSalary(basicSalary);
		double expectedAdditionalBouns=basicSalary* 50/100;
		assertEquals(expectedAdditionalBouns,basicsalarycalculator.getAdditionalBouns());
		double expectedGrossSalary=basicSalary/3;
		assertEquals(expectedGrossSalary,basicsalarycalculator.getGrossSalary());
		double expectedTotalSalary=basicSalary + expectedGrossSalary + expectedAdditionalBouns;
		assertEquals(expectedTotalSalary,basicsalarycalculator.gettotalSalary());
	}
	
	@Test
	@DisplayName("Test with InValid Number")  
	void testBasicSalarywithInvalidNumber() {
	   double basicSalary = -8000;
	   assertThrows(IllegalArgumentException.class, () -> {
		   basicsalarycalculator.setBasicSalary(basicSalary);
	    });
	}
}
