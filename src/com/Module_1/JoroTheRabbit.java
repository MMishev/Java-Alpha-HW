package com.Module_1;


import java.util.ArrayList;
import java.util.Scanner;

public class JoroTheRabbit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(", ");
        int counter =1;
        int temp = 1;
        int beforeJump = 0;
        int afterJump = 0;
        ArrayList<Integer> inputData = new ArrayList<Integer>();
        for (String x : input) {
            inputData.add(Integer.parseInt(x));
        }
        for (int i = 1; i < inputData.size(); i++) {
            for (int j = 0; j < inputData.size(); j++) {
                beforeJump = inputData.get(j);
                if ((j + i) >= inputData.size()) {
                    afterJump = inputData.get(j + i - inputData.size());
                } else {
                    afterJump = inputData.get(j + i);
                }

                if (beforeJump < afterJump) {
                    int jump = i + j;
                    while (beforeJump < afterJump) {
                        jump+=i;
                        temp++;
                        beforeJump = afterJump;
                        if ( jump >=inputData.size()){
                            jump = jump%inputData.size();
                            afterJump= inputData.get(jump);
                        }
                        else {
                            afterJump =inputData.get(jump);
                        }
                        if (temp > counter) {
                            counter = temp;
                        }
                    }
                    temp = 1;

                }
            }


        }
        System.out.println(counter);
    }
}


