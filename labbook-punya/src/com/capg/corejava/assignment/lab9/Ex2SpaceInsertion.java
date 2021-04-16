package com.capg.corejava.assignment.lab9;
import java.util.function.Consumer;
public class Ex2SpaceInsertion {
	


		public static void main(String[] args) {
			
			Consumer<String>
			fun= str-> System.out.println(str.replace("", " ").trim());
			fun.accept("   Punyakriti  ");

		}

	}


	
