package com.sunbeam;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Number is Palindrome or not
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		String str = String.valueOf(num);
		System.out.println(str.equals(new StringBuilder(str).reverse().toString())? "Yes " : "It's not ");
	}
	

	public static void main1(String[] args) {
		//Sring is Palindrome or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		str = str.toLowerCase();
		System.out.println(str.equals(new StringBuilder(str).reverse().toString())? "Yes " : "It's not");
	}
	

}
