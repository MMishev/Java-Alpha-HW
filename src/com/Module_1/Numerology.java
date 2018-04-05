package com.Module_1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Numerology {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] number = in.nextLine().split("");
        int firstDigit = 0;
        int secondDigit = 1;
        List<Integer> counters = Stream.generate(()->0).limit(10).collect(Collectors.toList());
        ArrayList<Integer> birthday = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            birthday.add(Integer.parseInt(number[i]));
        }
        System.out.println(performOperation(birthday,counters).toString().replace(",","").replace("[","").replace("]","").trim());


    }
    private static List<Integer> performOperation(ArrayList<Integer> birthday,List<Integer> counters){
        if (birthday.size()==1){
            int digit = birthday.get(0);
            counters.set(digit,counters.get(digit)+1);
            return counters;

        }
        for (int i = 0; i < birthday.size()-1; i++) {
            int firstDigit = birthday.get(i);
            int secondDigit = birthday.get(i+1);
            int result = (firstDigit + secondDigit) * (firstDigit ^ secondDigit) % 10;
            ArrayList<Integer> newBirthday = new ArrayList<>(birthday);

            newBirthday.remove(i);

            newBirthday.set(i,result);

            performOperation(newBirthday,counters);
        }




        return counters;

    }
}
