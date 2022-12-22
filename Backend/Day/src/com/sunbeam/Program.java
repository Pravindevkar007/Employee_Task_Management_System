package com.sunbeam;

import java.util.Arrays;
import java.util.HashSet;

import java.util.Set;

public class Program {
	
	public static void main1(String[] args) {
		//reverse sting
        String strNumber = String.valueOf("Pravin Devkar");
        StringBuilder sb = new StringBuilder(strNumber);
        sb.reverse();
        strNumber = sb.toString();
        System.out.println(strNumber);

	}
	public static void main2(String[] args) {
		//reverse Number
		int number = 123456789;
        String strNumber = String.valueOf(number);
        StringBuilder sb = new StringBuilder(strNumber);
        sb.reverse();
        strNumber = sb.toString();
        number =  Integer.parseInt(strNumber);
        System.out.println(number);

	}
	public static void main3(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 2, 5, 6, 6, 3, 1, 4, 12, 12, 2, 5, 7, 4, 2, 1, 0, 15 };
		Arrays.sort(arr);
//		System.out.println(arr[0]);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[arr.length-1]);
		for(int index = arr[arr.length-3];index < arr[arr.length-1];index++) {
			System.out.println(arr[index]);
		}
	}
	private static void remove(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for(int index = 0 ; index < arr.length;index++) {
			set.add(arr[index]);
		}
		System.out.println(set);
		Integer[] arr1 = set.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr1));
		// [0, 1, 2, 3, 4, 5, 6, 7]
		// Find top 3 max values in array?
		System.out.println("Find top 3 max values in array");
		for (int i = (arr1.length - 3); i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		// Write a program to reverse array?
		System.out.println("Write a program to reverse array");

		for (int j = (arr1.length - 1); j > 0; j--) {
			System.out.println(arr1[j]);
		}

	}
	public static void main4(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 2, 5, 6, 6, 3, 1, 4, 12, 12, 2, 5, 7, 4, 2, 1, 0, 15 };
		Arrays.sort(arr);
		remove(arr);
		
	}

}
