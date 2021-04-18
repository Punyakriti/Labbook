package com.capg.corejava.assignment.lab3;
import java.util.Scanner;
public class Ex2getImage {

	public String getImage(String str) {
		StringBuffer sb=new StringBuffer(str);  
	    sb.reverse();  
        return sb.toString();
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String : ");
		String str=sc.nextLine();
		
		Ex2getImage m= new Ex2getImage();
		String res=m.getImage(str);
		System.out.println("The String is : "+str+"|"+res);
		
	}

}