package com.example.test_module2;public class income_tax {    static double salary = 689878.91;    static double net_tax;    @SuppressWarnings("DefaultLocale")    public static void main(String[] args) {        if (salary >= 1500001) {            net_tax = ((salary - 1500001) * 0.3) + (300000 * 0.2) + (300000 * 0.15) + (300000 * 0.1) + (300000 * 0.05);            System.out.println("Entered salary = " + salary);            System.out.println("Total payable income tax on your salary without deduction = " + String.format("%.2f", net_tax));        } else if (salary >= 1200001) {            net_tax = ((salary - 1200001) * 0.2) + (300000 * 0.15) + (300000 * 0.1) + (300000 * 0.05);            System.out.println("Entered salary = " + salary);            System.out.println("Total payable income tax on your salary without deduction = " + String.format("%.2f", net_tax));        } else if (salary >= 900001) {            net_tax = ((salary - 900001) * 0.15) + (300000 * 0.1) + (300000 * 0.05);            System.out.println("Entered salary = " + salary);            System.out.println("Total payable income tax on your salary without deduction = " + String.format("%.2f", net_tax));        } else if (salary >= 600001) {            net_tax = ((salary - 600001) * 0.1) + (300000 * 0.05);            System.out.println("Entered salary = " + salary);            System.out.println("Total payable income tax on your salary without deduction = " + String.format("%.2f", net_tax));        } else if (salary >= 300001) {            net_tax = (salary - 300001) * 0.05;            System.out.println("Entered salary = " + salary);            System.out.println("Total payable income tax on your salary without deduction = " + String.format("%.2f", net_tax));        } else {            System.out.println("Entered salary = " + salary);            System.out.println("Income is below 3 Lakh, hence no Income tax amount will be deducted!");        }    }}