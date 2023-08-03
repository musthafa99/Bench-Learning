package com.cg.model;

public class BasicSalaryCalculator {
	double basicSalary;

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		if(basicSalary<0)
		{
			throw new IllegalArgumentException("Negative Salary is not valid");
		}
		this.basicSalary = basicSalary;
	}	
	public double gettotalSalary() {
		return this.basicSalary + getAdditionalBouns() + getGrossSalary();		
	}

	public double getGrossSalary() {
		return this.basicSalary/3;
	}

	public double getAdditionalBouns() {
		return this.basicSalary * 50/100;
	}

	
}
