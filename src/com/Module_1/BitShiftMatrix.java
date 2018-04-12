package com.Module_1;

import java.util.ArrayList;
import java.util.Scanner;

public class BitShiftMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int coef = Math.max(rows,cols);
        int moves = in.nextInt();
        int rowIndex = 0;
        int colIndex = 0;
        int[][] matrix = new  int[rows][cols];
        in.nextLine();
        
        String[] input = in.nextLine().split(" ");

        ArrayList<Integer> values = new ArrayList<Integer>();

        for(String x : input){
            values.add(Integer.parseInt(x));
        }

        for (int i = 0; i < moves; i++) {
            rowIndex = values.get(i)/coef;
            colIndex = values.get(i)%coef;


        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 1<< ((rows-1)-i+j);
                System.out.print(matrix[i][j]+",");
            }
            System.out.println();
        }


    }
}
