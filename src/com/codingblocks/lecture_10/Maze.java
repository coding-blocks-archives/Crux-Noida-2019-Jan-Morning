package com.codingblocks.lecture_10;

public class Maze {
    public static void main(String[] args) {
        mazePathDiag("", 4, 4);
    }

    public static int mazeCount(int row, int col){
        if (row == 1 && col == 1){
            return 1;
        }

        int count = 0;

        if (row > 1){
            count += mazeCount(row - 1, col);
        }

        if (col > 1){
            count += mazeCount(row, col - 1);
        }

        return count;
    }

    public static void mazePath(String path, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if (row > 1){
            mazePath(path +"V", row - 1, col);
        }

        if (col > 1){
            mazePath(path + "H", row, col - 1);
        }

    }

    public static void mazePathDiag(String path, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if (row > 1){
            mazePathDiag(path +"V", row - 1, col);
        }

        if (col > 1){
            mazePathDiag(path + "H", row, col - 1);
        }

        if (row > 1 && col > 1 && row == col){
            mazePathDiag(path + "D", row - 1, col - 1);
        }

    }

    public static int mazeDCount(int row, int col){
        if (row == 1 && col == 1){
            return 1;
        }

        int count = 0;

        if (row > 1){
            count += mazeDCount(row - 1, col);
        }

        if (col > 1){
            count += mazeDCount(row, col - 1);
        }


        if (row > 1 && col > 1){
            count += mazeDCount(row - 1, col - 1);
        }

        return count;
    }
}
