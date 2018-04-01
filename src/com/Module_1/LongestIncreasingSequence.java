package com.Module_1;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<Integer>();
        int n = in.nextInt();
        int temp = 1;
        int counter = 1;
        for (int i = 0; i < n; i++) {
           input.add(in.nextInt());
        }

        for(int i= 0; i< input.size()-1 ; i++){
            while(input.get(i)<input.get(i+1)){
                temp++;
                i++;
                if(i+1>=input.size()){
                    break;
                }

            }
            if(temp>counter){
                counter=temp;
            }
            temp=1;
        }
        System.out.println(counter);
    }
}
