package com.capg.corejava.assignment.lab9;


	import java.util.function.BiFunction;

	public class Ex1YPowerX {

		public static void main(String[] args) {
			
			BiFunction<Integer,Integer,Double> fun= (x,y)-> Math.pow(x,y);
			
			double res= fun.apply(2,5);
			
			System.out.println(res);
		}

	}

	


