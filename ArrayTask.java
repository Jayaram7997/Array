package org.array;

import java.util.Arrays;

//Splitting a single array in to two different array
public class ArrayTask 
{
	public static void main(String[] args) 
	{
		int a[] = new int[9];
		 a[0]= 10;
		 a[1]= 20;
		 a[2]= 10;
		 a[3]= 20;
		 a[4]= 30;
		 a[5]= 40;
		 a[6]= 50;
		 a[7]= 40;
		 a[8]= 60;
		int b[] = new int[5];
		int c[] = new int[4];
		for (int i = 0; i <= 4; i++) 
		{
			 b[i] = a[i];
		}
			
		for (int k = 0; k <=3; k++) 
		{
				c[k] = a[k+5];
		}
		System.out.println("B array values");
		for (int l = 0; l <= 4; l++) 
		{
			System.out.println(b[l]);
		}
		System.out.println("C array values");
		for (int m = 0; m <=3 ; m++) 
		{
			System.out.println(c[m]);
		}
		
	}
}			
		
