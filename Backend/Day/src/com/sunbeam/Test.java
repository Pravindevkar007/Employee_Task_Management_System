package com.sunbeam;
import java.util.HashSet;
import java.util.Set;
class Test {
	public static void main(String[] args) {
		String str = "Maharashtra";
		char[] arr1 =str.toCharArray();
		remove(arr1);
	}

	private static void remove(char[] arr1) {
		Set<Character> set = new HashSet<Character>();
		Set<Character> set1 = new HashSet<Character>();
		//remove dublicate elements
//		for (Character character : arr1) {
//			set.add(character);
//		}
//		System.out.println(set);
		
		
		//print dublicate elements
		for (Character character : arr1) {
			if(!set.add(character)) {
				set1.add(character);
			}
		}
		System.out.println(set1);
	}

}