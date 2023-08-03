package com.cg.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void test() {
		MinMaxFinder m=new MinMaxFinder();
		int expected[]= {5,21};
		assertArrayEquals(expected,m.findMinMax(new int[]{12,13,14,5,21},5));
		
	}
	@Test
	public void test1() {
		MinMaxFinder m=new MinMaxFinder();
		int expected[]= {12,21};
		assertArrayEquals(expected,m.findMinMax(new int[]{12,13,142,5,21,3},6));
		
	}
}
