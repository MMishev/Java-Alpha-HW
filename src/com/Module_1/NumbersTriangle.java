package com.Module_1;


import java.util.ArrayList;
import java.util.Scanner;

public class NumbersTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        numbersTriangle(number);
    }

    private static void numbersTriangle(int number) {
        ArrayList<Integer> toPrint = new ArrayList<Integer>();
        for(int i= 1; i<= number ; i++){
            toPrint.add(i);
            System.out.println(String.format(toPrint.toString(), " ").replace(",","").replace("[","").replace("]","").trim());
        }
        for (int i = number; i >1 ; i--) {
            toPrint.remove(toPrint.indexOf(i));
            System.out.println(String.format(toPrint.toString(), " ").replace(",","").replace("[","").replace("]","").trim());
        }
    }
}

