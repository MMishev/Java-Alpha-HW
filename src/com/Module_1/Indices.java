package com.Module_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Indices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in .nextInt();
        int index ;
        ArrayList<Integer> inputData = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();


        for (int i = 0; i < length; i++) {
            inputData.add(in.nextInt());
        }

        for (int i = 0; i < length; ) {
            if (i>length){

            }
            result.add(inputData.get(i));

            i= inputData.get(i);

        }
        System.out.println(result.toString());
    }
}
