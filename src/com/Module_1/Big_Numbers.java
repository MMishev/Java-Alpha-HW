package com.Module_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Big_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstLenght = in.nextInt();
        int secondLenght = in.nextInt();
        ArrayList<Integer> arrayOne = new ArrayList<Integer>();
        ArrayList<Integer> arrayTwo = new ArrayList<Integer>();
        ArrayList<Integer> finalArray = new ArrayList<Integer>();
        int number =0;
        StringBuilder toPrint = new StringBuilder();
        for (int i = 0; i < firstLenght; i++) {
            arrayOne.add(in.nextInt());
        }
        for (int i = 0; i < secondLenght ; i++) {
            arrayTwo.add(in.nextInt());
        }
        if(firstLenght>secondLenght){
            for (int i = 0; i <firstLenght-secondLenght ; i++) {
                arrayTwo.add(0);
            }
        }
        else {
            for (int i = 0; i < secondLenght-firstLenght; i++) {
                arrayOne.add(0);
            }
        }

        for (int i = 0; i < arrayOne.size(); i++) {

            number += (arrayOne.get(i)+arrayTwo.get(i))%10;
            if (number>=10){
                finalArray.add(number%10);
                number = 1;
            }
            else {
                finalArray.add(number);
                number = 0;
            }


            if ((arrayOne.get(i)+arrayTwo.get(i))/10>0){
                number +=1;

            }
        }

        for(int x :finalArray){
            toPrint.append(x).append(" ");
        }
        System.out.println(toPrint.toString().trim());

    }
}
