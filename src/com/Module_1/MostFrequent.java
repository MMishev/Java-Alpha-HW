package com.Module_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int tempCounter = 0;
        int counter =0;
        int tempNumber;
        int number =0;
        ArrayList<Integer> inputData = new ArrayList<Integer>();

        for(int i= 0; i< length ; i++){
            inputData.add(in.nextInt());
        }
        for(int i= 0; i< length ; i++){
            tempNumber = inputData.get(i);
            for(int j= 0; j< length ; j++){
                if (inputData.get(j)==tempNumber){
                    tempCounter++;
                }
            }
            if (tempCounter>counter){
                counter = tempCounter;
                number = tempNumber;
            }

            tempCounter =0;
        }
        System.out.printf("%d(%d times)",number,counter);
    }
}
