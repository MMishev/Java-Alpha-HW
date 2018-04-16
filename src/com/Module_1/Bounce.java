package com.Module_1;

import java.math.BigInteger;
import java.util.Scanner;

public class Bounce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
//
        int dRow = 1;
        int dCol = 1;
        int row = 0;
        int col = 0;
        BigInteger sum = BigInteger.ZERO;
        BigInteger two = BigInteger.valueOf(2);

        if (rows == 1 || cols==1){

            System.out.println((int)Math.pow(2,row+col));
            return;
        }
        while (true){
            sum = sum.add((two.pow(row+col)));
            row+=dRow;
            col+=dCol;
            if (row == rows-1 || row == 0){
                dRow*=-1;
            }
            if (col == cols-1||col == 0){
                dCol*=-1;
            }
            if (isCorner(row,col,rows,cols)){
                sum = sum.add((two.pow(row+col)));
                System.out.println(sum);
                break;
            }
        }
    }



    private static boolean isCorner(int row, int col,int rows,int cols) {

        return (row == rows-1|| row ==0 ) && (col == cols-1 || col == 0);
    }
}

