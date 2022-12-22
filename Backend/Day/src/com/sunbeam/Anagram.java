package com.sunbeam;

import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        // char[] as = a.toUpperCase().toCharArray();
        // char[] bs = b.toUpperCase().toCharArray();
        // java.util.Arrays.sort(as);
        // java.util.Arrays.sort(bs);
        // return new String(as).equals(new String(bs));
        
        a=a.toLowerCase();
        b=b.toLowerCase();
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        a=java.util.Arrays.toString(arr1);
        b=java.util.Arrays.toString(arr2);
        if(a.equals(b))
        {
            return true;
        }
         return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
