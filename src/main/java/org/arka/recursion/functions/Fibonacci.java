package org.arka.recursion.functions;

public class Fibonacci {
    public static void main(String[] args){

        System.out.println(fib1(5));
    }

    public static int fib(int n){

        if(n<=1){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }


    public static int fib1(int n){
        if(n==1){
            return n;
        }
        if(n==2){
            return n;
        }
        if(n==3){
            return n;
        }
        return fib1(n-1)+fib1(n-3);
    }

}


