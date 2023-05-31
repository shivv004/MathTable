package com.example.test_module;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyClass {
    public static void main(String[] args) throws Exception {
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        InputStreamReader r=new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(r);
//        System.out.println("Enter a number:");
//        Thread.sleep(7000);
//        String str=br.readLine();
//        System.out.println(str);
//        int a = Integer.parseInt(str);
        int a = 5;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * a;
        }
        System.out.println("Math Table for number " + a + ":");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(a + " x " + arr2[j] + " = " + arr[j]);
        }
    }
}