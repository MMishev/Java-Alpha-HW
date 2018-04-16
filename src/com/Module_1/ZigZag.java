package com.Module_1;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
//        long[][] matrix = new long[rows][cols];
//
//        for(int r= 0; r< rows ; r++){
//            for (int c = 0; c < cols; c++) {
//                matrix[r][c]= (((r+c)*3)+1);
//            }
//        }
        int dRow = 1;
        int dCol = 1;
        int row = 0;
        int col = 0;
        long sum = 0;
        while (true){
           sum += (((row+col)*3)+1) ;
           row+=dRow;
           col+=dCol;
           dRow*=-1;
           if (col == cols-1||col == 0){
               dRow*=-1;
               dCol*=-1;
           }
           if (isCorner(row,col,rows,cols)){
               sum+=(((row+col)*3)+1) ;
               System.out.println(sum);
               break;
           }
        }

    }

    private static boolean isCorner(int row, int col,int rows,int cols) {
        return (row == rows-1) && (col == cols-1 || col == 0);
    }
}
