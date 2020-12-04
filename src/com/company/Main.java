package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your calculation like 1 + 1");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        String op = scanner.next();
        int num2 = scanner.nextInt();
        System.out.println(compute(left, op, right));
    }



    private static int compute(int left, String op, int right) {
        switch (op.charAt(0)) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;
        }
        throw new IllegalArgumentException("Unknown operator:" + op);
    }
}
