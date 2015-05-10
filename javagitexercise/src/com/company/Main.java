package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(reverseString("Quispe"));

        System.out.println("YOOOO");
        System.out.println("TEST");
    }
    public static String reverseString(String string){
        return new StringBuilder(string).reverse().toString();
    }
}
