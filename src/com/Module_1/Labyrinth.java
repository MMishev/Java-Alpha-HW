package com.Module_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Labyrinth {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int rowsCount = in.nextInt();
        int colsCount = in.nextInt();
        int startX = in.nextInt();
        int startY = in.nextInt();
        int endX = in.nextInt();
        int endY = in.nextInt();


        List<List<String>> rows = Stream.generate(()-> Stream.generate(()-> "-").limit(colsCount).collect(Collectors.toList())).limit(rowsCount).collect(Collectors.toList());
        rows.get(startX).set(startY,"S");
        rows.get(endX).set(endY,"E");


//        for (List<String> row : rows) {
//            System.out.println(row);
//        }


        System.out.println(escapeLabyrinth(rows,startX,startY,endX,endY));
//

    }
    private static boolean escapeLabyrinth(List<List<String>> rows, int startX, int startY, int endX, int endY){

        if (startX<=0|| endX<=0 || startY<=0 || endY<=0){
            return false;
        }
        if (startX>=rows.size() || endX>= rows.size() || startY>=rows.get(0).size() || endY>= rows.get(0).size()){
            return false;
        }
        if (rows.get(startX).get(startY)=="E"){

            return true;
        }
        if(rows.get(startX).get(startY)=="-"){
            return false;
        }
        rows.get(startX).set(startY,"-");

        boolean hasEscape =escapeLabyrinth(rows,startX-1,startY,endX,endY)||
                           escapeLabyrinth(rows,startX,startY+1,endX,endY)||
                           escapeLabyrinth(rows,startX+1,startY,endX,endY)||
                           escapeLabyrinth(rows,startX,startY+1,endX,endY);

        if (hasEscape){
            return hasEscape;
        }
        return  false;
    }



}
