package com.capg.corejava.assignment.lab1;
import java.util.Scanner;
public class ex5calculatesum {

			public static void main(String[] args) {
				int n,Sum= 0,i;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the integer upto which sum is to be printed");
				n = sc.nextInt();
				
				for(i=1;i<=n;i++) {
					if(i%3==0 || i%5==0) {
					Sum = Sum +i;
					System.out.println("No. is: " +i+ " ");
				}
				}
				System.out.println("Total Sum: " +Sum);
			}

		
	}


