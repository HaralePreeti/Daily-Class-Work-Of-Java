//package com.test;
//
////String is sequence of characters
//
//public class StringDemo1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//using character array
//		char[] helloArray= {'h','e','l','l','o','.'};
//			String helloString=new String(helloArray);
//			System.out.println(helloString);
//			
//			//using string variable
//			String myName="Preeti";
//			
//			System.out.println(myName);
//			
//			//Using String class object
//			String schoolName=new String("SSWCOE");
//			System.out.println(schoolName);
//	}
//}


//with user input

package com.test;

import java.util.Scanner;

//String is sequence of characters
public class StringDemo1 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using character array
		String coun;
		char[] helloArray= {'h','e','l','l','o','.'};
			String helloString=new String(helloArray);
			System.out.println(helloString);
			
			//using string variable
			String myName="Preeti";
			
			System.out.println(myName);
			
			//Using String class object
			String schoolName=new String("SSWCOE");
			System.out.println(schoolName);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your country");
			coun=sc.nextLine();
			System.out.println("You have entered country:"+coun);
	}
}



