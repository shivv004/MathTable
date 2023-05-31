package com.example.test_module2;

public class MyClass {
    public static void main(String[] args){
        int n = 10000;
        int j,k = 0;
        for(int i = 0; i < n ; i++) {
            j = i+1;
            k += j;
        }
        System.out.println("\nSum of first " + n + " natural numbers = " + k);
    }
}