package com.my;

import org.junit.Test;

public class MyArray {
	@Test
	public void M() {

		int a[] = new int[5];
		a[0] = 18;
		a[1] = 23;
		a[2] = 25;
		a[3] = 15;
		a[4] = 27;
		/*
		 * a[5]=30;//int a[]=new int[5]; size is fixed here which start from 0,1,2,3,4
		 * will stop here a[6]=90;
		 */

		System.out.println(a[0]);

	}

	@Test
	public void m1() {
		String v[] = new String[2];// simple declare String type Array

		v[0] = "flower";
		v[1] = "cow";
		System.out.println(v[1] + v[0]);

		for (int a = 1; a <= 2; a++) {

			System.out.println(a + v[0]);
		}

	}

	@Test
	public void max_number() {
				 // | | | |
				 // 0,1,2,3 index number
		int a[] = { 2, 3, 4, 5 };
		// System.out.println(a[2]);//4
		// System.out.println(a[3]);//5
		// System.out.println(a[5]);//java.lang.ArrayIndexOutOfBoundsException: 5
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]> max) {

				max = a[i];

			}
			System.out.println(max + "max number");

		}
	}

	@Test
	public void min_number() {
		int a[] = { 12, 13, 14, 15 };
		int min = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];

			}
			System.out.println(min + " min number");

		}

	}
@Test
public void bigToSmall() {
int a[]= {1,2,3,4,5};	
for(int i=1;i<a.length-1;i--) {
	
	if(a[i]<=i)
	System.out.println(a[i]+" choto thakay boro");
	
}
	
}
}
