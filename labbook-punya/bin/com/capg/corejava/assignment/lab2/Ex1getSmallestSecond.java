package com.capg.corejava.assignment.lab2;
import java.util.*;
import java.io.*;

public class Ex1getSmallestSecond {
	public int getSecondSmallest(int a[]) {
		Arrays.sort(a);
		for (int j = 0; j < a.length; j++)
			System.out.println("Sorted elements of array : " + a[j]);

		return a[1];
	}

	public static void main(String[] args) {
		int size = 0, small;
		Scanner ar = new Scanner(System.in);
		System.out.println("enter size of array :");
		size = ar.nextInt();
		int a[] = new int[size];
		System.out.println("enter elements of array :");
		for (int i = 0; i < size; i++) {
			a[i] = ar.nextInt();
		}
		for (int j = 0; j < size; j++)
			System.out.println("Elements of array : " + a[j]);
		System.out.println();
		Ex1getSmallestSecond ss1 = new Ex1getSmallestSecond();
		small = ss1.getSecondSmallest(a);
		System.out.println("SECOND SMALLEST ELEMENT IS :" + small);

	}
}