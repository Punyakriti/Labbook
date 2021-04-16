package com.capg.corejava.assignment.lab1;
import java.util.Scanner;

public class ex3FibnocciSeries {

	public static void main(String[] args) {
		int n,i, a=1,b=1,c, count=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the no. of sequence");
		n= sc.nextInt();
		
		for(i=3; i<=n; ++i)
		{
			c=a+b;
			a=b;
			b=c;
			count = c;

		}
		System.out.print(count);

	}

}
