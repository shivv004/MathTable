package com.example.test_module2;

public class nested_loop {
    static int row = 5;
    public static void main(String[] args) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
