package com.sunbeam;

import java.io.*;
import java.util.*;

public class Tokanizer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter line :");
        String s = scan.nextLine();
        // Write your code here.
        String delim =  " ,'? !";
        StringTokenizer stk = new StringTokenizer(s,delim);
        String token = null;
        int count = stk.countTokens();
        System.out.println(count);
        while(stk.hasMoreTokens()){
            token = stk.nextToken();
            System.out.println(token);
        }
        scan.close();
    }
}
