package br.com.ds.algorithms;

public class Fibonacci {
    public static void main(String []args){
        int n = 5;
        long startTime = System.nanoTime();
        System.out.println(Fibonacci.recursive(n)); 
        long endTime = System.nanoTime();
        System.out.println("Tempo Recursivo: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        System.out.println(Fibonacci.dynamic(n)); 
        endTime = System.nanoTime();
        System.out.println("Tempo Dinamico: " + (endTime - startTime) / 1e6 + " ms");
    }

    private static long recursive(int n){
        if(n <= 1) return n;
        return recursive(n - 1) + recursive(n - 2);
    }
    private static long dynamic(int n){
        long []dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
