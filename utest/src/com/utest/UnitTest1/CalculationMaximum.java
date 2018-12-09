package com.utest.UnitTest1;

public class CalculationMaximum {
	public static int maxArray(int[] a ) {
		int num=0;
		for(int i=0; i<a.length; i++) {
			
				if(num<a[i]) {
					num=a[i];
				}
		}
				return num;
			}
	
}
