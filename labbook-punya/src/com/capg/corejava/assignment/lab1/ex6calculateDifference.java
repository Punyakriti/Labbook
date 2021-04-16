package com.capg.corejava.assignment.lab1;
import java.util.Scanner;
public class ex6calculateDifference {
	
		public static void main(String[] args) {
			int n,i,sum1 = 0, sum2 = 0, diff;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the no");
			n = sc.nextInt();
			
			for(i=1;i<=n;i++) {
				sum1 = sum1 + i*i;
			}
			System.out.println("sum of square of nos: " +sum1);
			
			for (i=1;i<=n;i++) {
				sum2 = sum2 + i;
			}
			System.out.println("sum of no is: " +sum2);
			
			
			diff = sum1 - sum2;
			System.out.println("difference is: " +diff);
		}

	

	}


