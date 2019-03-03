package com.codingblocks.lecture_10;

public class MazeBoard {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;

        boolean[][] maze = new boolean[row + 1][col + 1];

        maze[0][1] = true;

        maze("", 0, 0, row, col, maze);

    }

    public static void maze(String path, int c_row, int c_col, int row, int col, boolean[][] maze){

        // mil gya khanaa
        if (c_row == row && c_col == col){
            System.out.println(path);
            return;
        }

        // maze se bahar jayega kya?
        if (c_col < 0 || c_row < 0 || c_row > row || c_col > col){
            return;
        }

        // bhai yaha already aa chuka hai
        if (maze[c_row][c_col]){
            return;
        }

        // ab se ye bhi visited
        maze[c_row][c_col] = true;

        maze(path + "U", c_row - 1, c_col, row, col, maze);
        maze(path + "R", c_row, c_col + 1, row, col, maze);
        maze(path + "D", c_row + 1, c_col, row, col, maze);
        maze(path + "L", c_row , c_col - 1, row, col, maze);

        // ab yaha wapas aa sakta hai
        maze[c_row][c_col] = false;
    }
}
