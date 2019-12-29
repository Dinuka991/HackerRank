package dev.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stdout2 {

	
    public static void main (String args[]) throws NumberFormatException, IOException {
    	
    	 BufferedReader reader =  
                 new BufferedReader(new InputStreamReader(System.in));
    	int i = Integer.parseInt(reader.readLine());
    	double d = Double.parseDouble(reader.readLine());
    	String s = reader.readLine();
    	
        System.out.println("s");
        System.out.println("Int: " + i);
        System.out.println("Int: " + d);
        System.out.println("Int: " + s);
        
    }
	
	
	
	
}
