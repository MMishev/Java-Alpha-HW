package com.Module_1;

import java.util.Scanner;

public class BiggestPrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(biggestPrime(in.nextInt()));
    }
    private static int biggestPrime(int number){
        int toReturn = 1;
        for (int i = number; i >=1 ; i--) {
            if (isPrime(i)){
                toReturn=i;
                return toReturn;
            }
        }

        return toReturn;
    }
    private static boolean isPrime(int number){
        boolean isPrime = true;
        int maxDivider = (int)Math.sqrt(number);
        for (int i = 2; i <= maxDivider  ; i++) {
            if(number%i==0){
                isPrime=false;
            }
        }

        return isPrime;

    }
}
