package com.cg.model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);		
		int n=ip.nextInt();
		int numbers[]=new int[n];
		for(int i=0;i<n;i++)
		{
			numbers[i]=ip.nextInt();
			//System.out.println(numbers[i]);
		}
		MinMaxFinder m=new MinMaxFinder();
		int minmax[]=m.findMinMax(numbers,n);
		for(int i=0;i<2;i++)
		{
			System.out.println(minmax[i]);
		}
		

	}

}
