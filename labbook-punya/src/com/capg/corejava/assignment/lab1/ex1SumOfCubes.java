package com.capg.corejava.assignment.lab1;

import java.util.Scanner;

public class ex1SumOfCubes {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the integer n");
		n=sc.nextInt();
		
		if(n<0)
			{System.out.println("negative integer is not allowed");
			return;
			}
		
		 double sum= Math.pow(n*(n+1)/2, 2) ;
		 System.out.println("sum of first "+n+" cube no. is "+sum);
		 n= n*n*n;
		 System.out.println("cube of given no. is "+n);
		 
	}

}
