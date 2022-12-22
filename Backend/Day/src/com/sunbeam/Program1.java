package com.sunbeam;

import java.util.ArrayList;
import java.util.Spliterator;

public class Program1 {
	public static void main(String[] args) {
		ArrayList<Double>vals = new ArrayList();
		vals.add(1.0);
		vals.add(4.0);
		vals.add(16.0);
		Spliterator<Double>splitr = vals.spliterator();
		while(splitr.tryAdvance((n) -> System.out.print(" "+n)));
		System.out.println();
		splitr = vals.spliterator();
		ArrayList<Double>sqrs = new ArrayList();
		while(splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
		splitr = sqrs.spliterator();
		splitr.forEachRemaining((n) -> System.out.print(" "+n));
		
	}

}
