package com.test;

import java.util.Scanner;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		myName=sc.nextLine();
		
		//Find character at specific position
		
		char c=myName.charAt(2);
		System.out.println("The character at index 2 is:"+c);
		
		//find index of specific character
		
		int index=myName.indexOf('e');
		System.out.println("index of specific character is:"+index);
		

	}

}
