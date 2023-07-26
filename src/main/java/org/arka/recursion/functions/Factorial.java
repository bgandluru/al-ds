package org.arka.recursion.functions;

public class Factorial {

    public static void main(String[] args){

        int factVal = factorial(3);

        System.out.println(factVal);

    }



    static int factorial(int n){
        if(n==1){
            return n;
        }

        return n*factorial(n-1);

    }


}
