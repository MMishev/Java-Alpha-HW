package com.Module_1;

import java.util.Scanner;

public class AllocateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for(int i= 0; i< number; i++){
            System.out.println(i*5);
        }
    }
}
