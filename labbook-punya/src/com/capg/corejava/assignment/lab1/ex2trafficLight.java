package com.capg.corejava.assignment.lab1;
import java.util.Scanner;

public class ex2trafficLight {
	 

	public static void main(String[] args) {
		
		String color;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter color of light");
		color= sc.next();
		
		color=color.toLowerCase();
		
		System.out.println("entered color is: " +color);
		
		switch(color) {
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
		System.out.println("ready");
		break;
		case "green":
			System.out.println("go");
			break;
			default:
				System.out.println("invalid input");
		break;
		
		}
		

		}

	}

