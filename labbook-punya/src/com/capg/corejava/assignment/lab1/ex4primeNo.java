package com.capg.corejava.assignment.lab1;
import java.util.Scanner;

public class ex4primeNo {

	public static void main(String[] args) {

			int n,p;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the integer upto which prime nos to be printed");
			n = sc.nextInt();
			
			
			for(int i=2;i<n;i++)
			{
				p=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					p=1;
				}
				if(p==0)
					System.out.print(i+ " ");
			}
			

		}

	}