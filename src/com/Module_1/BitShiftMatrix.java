package com.Module_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class BitShiftMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int coef = Math.max(rows,cols);
        int moves = in.nextInt();
        int startRow = rows-1;
        int startCol = 0;
        boolean[][] matrix = new  boolean[rows][cols];

        for (int i = 0; i < moves; i++) {
            int code = in.nextInt();
            int nextRow = code / coef;
            int nextCol = code % coef;
            int colDir = startCol<nextCol
                    ? 1
                    : -1;

            while(startCol!=nextCol){
                matrix[startRow][startCol] = true;
                startCol+=colDir;
            }

            int rowDir = startRow<nextRow
                    ? 1
                    : -1;
            while (startRow!=nextRow){
                matrix[startRow][startCol] = true;
                startRow+=rowDir;
            }
            matrix[startRow][startCol] = true;
        }

        BigInteger result = BigInteger.ZERO;

        for (int r = 0; r < rows ; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c]){
                    result = result.add(getValue(r,c,rows));
                }
            }
        }
        System.out.println(result);


    }

    private static BigInteger getValue(int r, int c,int rows) {
        int power = rows-1-r+c;
        return BigInteger.valueOf(2).pow(power);
    }
}
