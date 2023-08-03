package com.cg.model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double basicSalary=input.nextDouble();
		BasicSalaryCalculator basic=new BasicSalaryCalculator();
		basic.setBasicSalary(basicSalary);
		System.out.println("Basic Salary is:" + basic.getBasicSalary());
		System.out.println("Additional Bonus is:" + basic.getAdditionalBouns());
		System.out.println("Gross Salary is:" + basic.getGrossSalary());
		System.out.println("Total Salary is:" + basic.gettotalSalary());
	}

}
