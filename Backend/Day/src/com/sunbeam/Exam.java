package com.sunbeam;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5};
		acceptRecord(arr);
		printRecord(arr);
	}

	public static void main1(String[] args) {
		int arr [] = {1,2,3,4,5};
		acceptRecord(arr);
		printRecord(arr);
	}

	private static void acceptRecord(int[] arr) {
		for(int index = 0 ; index < arr.length ; index ++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number : ");
			arr[index] = sc.nextInt();
		}
	}
	private static void printRecord(int[] arr) {
		for (int i : arr) {
			System.out.print("<div>"+ i + "</div>" );
		}
	}
}
