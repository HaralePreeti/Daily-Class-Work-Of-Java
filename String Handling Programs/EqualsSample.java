package com.test;

import java.util.Scanner;

public class EqualsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Preeti";
		String s2="preeti";
		
		String place;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your place:");
		place=sc.nextLine();
			String newPlace=place.replace("G", "O");
			System.out.println("The new string is:"+newPlace);
		System.out.println(s1.equals(s2));
		

	}

}
