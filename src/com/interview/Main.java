package com.interview;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] memo = new int[5];
        int result = fib(5,memo);
        System.out.println("Fib Result : "+result);
    }

    static int fib(int n, int[] memo){
        if(memo[n]!=0){
            return memo[n];
        }
        if(n==1 || n==2){
            return 1;
        }
        int result = fib(n-1,memo)+ fib(n-2,memo);
        return result;
    }

}
