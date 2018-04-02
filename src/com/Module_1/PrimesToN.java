package com.Module_1;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimesToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        ArrayList<Integer> toPrint = new ArrayList<Integer>();
        for(int i= 1; i<= number ; i++){
            if (isPrime(i)){
                toPrint.add(i);
            }
        }
        System.out.println(String.format(toPrint.toString(), " ").replace(",","").replace("[","").replace("]","").trim());


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
