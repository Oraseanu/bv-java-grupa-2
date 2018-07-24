package com.siit.oraseanu.Recursion;

public class Fibonacci {
    public static int fibonacci (int n) {
        System.out.println(n);
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);

    }
}

