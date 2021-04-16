package com.capg.corejava.assignment.lab9;
import java.util.function.BiPredicate;

public class Ex3CredentialsAuthentication {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			BiPredicate<String,String> fun=(str1,str2)->{
				if(str1.equals("User1") && str2.equals("pwd@123"))
					return true;
				else
					return false;
			};
			boolean res1= fun.test("User1", "pwd#123");
			boolean res2= fun.test("User1", "pwd@123");
			boolean res3= fun.test("User2", "pwd@123");
			boolean res4= fun.test("user2", "pwd#456");
			System.out.println(res1+" "+res2+" "+res3+" "+res4);
		}

	}

	