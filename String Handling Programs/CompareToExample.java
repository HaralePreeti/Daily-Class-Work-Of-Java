package com.test;

import java.util.Scanner;

public class CompareToExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		String s2;
		String s3;
		String s4;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter frist string:");
		s1=sc.nextLine();
		
		System.out.println("Enter second string:");
		s2=sc.nextLine();
		
		System.out.println("Enter thrid string:");
		s3=sc.nextLine();
		
		System.out.println("Enter fourth string:");
		s4=sc.nextLine();
		
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s1.compareTo(s4));
	}

}
