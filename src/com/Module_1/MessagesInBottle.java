package com.Module_1;

import java.util.Scanner;

public class MessagesInBottle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] letters = in.nextLine().split("[0-9]");

        for(String string : letters){
            System.out.println(string);
        }
    }
}