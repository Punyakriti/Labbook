package com.capg.corejava.assignment.lab1;
import java.util.Scanner;
public class ex7checkNumber {

	public static void main(String[] args) {
		
		
				int n;
				boolean x = false;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the no");
				n =sc.nextInt();
				
				int currentNumber = n % 10;
			       n = n/10;
			        
			      
			       while(n>0){
			           if(currentNumber <= n % 10){
			               x = true;
			               break;
			           }

			           currentNumber = n % 10;
			           n = n/10;
			       }
			        
			       
			       if(x){
			           System.out.println("nos are not in increasing order");
			       }else {
			           System.out.println("nos are in increasing order");

			}
			}
		}


	
