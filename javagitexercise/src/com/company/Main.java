package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(reverseString("Quispe"));
    }
    public static String reverseString(String string){
        return new StringBuilder(string).reverse().toString();
    }
}
