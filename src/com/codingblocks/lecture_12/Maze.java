package com.codingblocks.lecture_12;

public class Maze {
    public static void main(String[] args) {

    }

    public static int maze(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }

        return maze(row-1,  col) + maze(row, col-1);
    }

    public static int mazeDP(int row, int col, Integer[][] memory){
        if (row == 1 || col == 1){
            return 1;
        }

        if (memory[row][col] != null){
            return memory[row][col];
        }

        int count = 0;
        count += mazeDP(row-1,  col, memory);
        count += mazeDP(row, col-1, memory);

        memory[row][col] =  count;

        return memory[row][col];
    }

    public static int mazeDPItr(int row, int col, Integer[][] memory){
        for (int r = 1; r <= row ; r++) {
            for (int c = 1; c <= col ; c++) {
                if (r == 1 || c == 1){
                    memory[r][c] = 1;
                } else {
                    memory[r][c] = memory[r-1][c] + memory[r][c-1];
                }
            }
        }

        return memory[row][col];
    }

}
