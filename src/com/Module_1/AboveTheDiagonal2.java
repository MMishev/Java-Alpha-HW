package com.Module_1;

import java.math.BigInteger;
import java.util.Scanner;

public class AboveTheDiagonal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixLength = scanner.nextInt();
        BigInteger sum = BigInteger.valueOf(0);

        long[][] matrix = new long[matrixLength][matrixLength];

        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                int number = i+j;
                long equals =(long)(Math.pow(2,number));

                matrix[i][j] = equals;

                if(i>=j){
                    sum = sum.add(BigInteger.valueOf(matrix[i][j]));
                }

            }


        }

        System.out.println(sum);

    }

}
