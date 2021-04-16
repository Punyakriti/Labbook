package com.capg.corejava.assignment.lab1;
import java.util.Scanner;
public class ex8checkNumber {

			public static void main(String[] args) {
				int n;
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the no");
				n = sc.nextInt();
				
				while(n%2==0) {
					n=n/2; 
					}
					if(n==1) {
						System.out.println("no is power of 2");
					}
					else {
						System.out.println("no is not power of 2");
					}
						 }
			 	
			}

	
