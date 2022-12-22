package com.sunbeam;
class Test4{
	private void first() {
		second();
		System.out.println("1");
		
	}

	private void second() {
		third();
		System.out.println("2");
	}

	private void third() {
		System.out.println("3");
		try {
			int sum = 4/0;
			System.out.println("4");
		}catch (ArithmeticException e) {
			System.out.println("5");
		}
	}
}


public class PyramidPattern {
	public static void main(String args[]) {
		
	}
}