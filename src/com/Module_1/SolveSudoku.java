package com.Module_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SolveSudoku{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] numbers ;


        List<List<String>> puzzle =  Stream.generate(()-> Stream.generate(()-> "-").limit(9).collect(Collectors.toList())).limit(9).collect(Collectors.toList());


        for (int i = 0; i < 9; i++) {
            numbers = in.nextLine().toCharArray();
            for (int j = 0; j < 9; j++) {
                puzzle.get(i).set(j,String.valueOf(numbers[j]));
            }
        }

        solveSudoku(puzzle);

        for(List<String> x : puzzle){
            System.out.println(x.toString().replace(",","").replace("[","").replace(" ","").replace("]","").trim());
        }
    }
    private static void solveSudoku(List<List<String>> puzzle){
        solveCell(puzzle,0,0);
    }
    private static boolean solveCell(List<List<String>> puzzle,int row, int col){
        if (row ==9){
            return true;
        }


        if (!puzzle.get(row).get(col).contains("-")) {
            if (solveCell(puzzle,col == 8? (row + 1): row, (col + 1) % 9)) {
                return true;
            }
        }
        else {
            int[] solutionNumbers = {1,2,3,4,5,6,7,8,9};
            for (int i = 0; i < 9; i++) {
                if(!checkIf3x3Contains(puzzle,row,col,solutionNumbers[i])&&!checkIfRowOrColContains(puzzle,row,col,solutionNumbers[i])){
                    puzzle.get(row).set(col,String.valueOf(solutionNumbers[i]));
                    if (solveCell(puzzle,col == 8? (row + 1): row, (col + 1) % 9))
                        return true;
                    else {
                        puzzle.get(row).set(col,"-");
                    }
                }
            }

        }

        return false;
    }

    private static boolean checkIfRowOrColContains(List<List<String>> puzzle, int row , int col , int value){
        for (int i = 0; i < 9; i++) {
            if (i != col) {
                if (!puzzle.get(row).get(i).contains("-")) {
                    if (Integer.parseInt(puzzle.get(row).get(i)) == value) {
                        return true;
                    }
                }
            }
            if (i != row) {
                if (!puzzle.get(i).get(col).contains("-")) {
                    if (Integer.parseInt(puzzle.get(i).get(col)) == value) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean checkIf3x3Contains(List<List<String>> puzzle,int row, int col,int value){
        int startRow = row / 3 * 3;
        int startCol = col / 3 * 3;

        // Check within its 3x3 box except its cell
        for (int i = startRow; i < startRow + 3; i++)
            for (int j = startCol; j < startCol + 3; j++) {
                if (!(i == row && j == col)) {

                    if (!puzzle.get(i).get(j).contains("-")) {
                        if (Integer.parseInt(puzzle.get(i).get(j)) == value) {
                            return true;
                        }
                    }
                }
            }

        return false;
    }


}