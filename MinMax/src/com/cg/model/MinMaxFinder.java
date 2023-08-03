package com.cg.model;

public class MinMaxFinder {

	public int[] findMinMax(int numbers[],int size)
	{
		int min=numbers[0];
		int max=numbers[0];
		for(int i=1;i<size;i++)
		{
			if(numbers[i]>max)
			{
				max=numbers[i];
			}
			else
			{
				min=numbers[i];
			}
		}
		int maxmin[]= {min,max};
		
		return maxmin;
	}
}
