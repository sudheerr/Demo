package com.interview;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int n =1000;
        long[] memo = new long[n+1];
        //long result = fib(n, memo);// Will throw stack over flow

        BigInteger result = fib3(n);

        System.out.println("Fib Result : "+result);
    }

    //Recursive Approach with Memoize
    static long fib(int n, long[] memo){
        if(memo[n]!=0){
            return memo[n];
        }
        if(n==1 || n==2){
            return 1;
        }
        long result = fib(n-1,memo)+ fib(n-2,memo);
        memo[n]=result;
        return result;
    }


//BottomUp Approach-- Most efficient
    static long fib(int n){
        long[] memo = new long[n+1];
        memo[1]=1;
        memo[2]=1;
        for(int i=3;i<=n;i++){
            memo[i]=memo[i-1]+memo[i-2];
        }
        return memo[n];
    }
//Using BigInteger
    static BigInteger fib3(int n){
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for (int j=2 ; j<=n ; j++)
        {
            c =  a.add(b);
            a = b;
            b = c;
        }
        return a;
    }
}
