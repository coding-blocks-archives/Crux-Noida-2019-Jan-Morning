package com.codingblocks.lecture_12;

public class Board {
    public static void main(String[] args) {
        int target = 50;
        Integer[] memory = new Integer[target + 1];

        System.out.println(boardDPItr(50, 6, memory));
    }

    public static int board(int target, int face){
        if (target == 0){
            return 1;
        }

        int count = 0;

        for (int i = 1; i <= face && i <= target; i++) {
            count += board(target-i, face);
        }

        return count;
    }

    public static int boardDP(int target, int face, Integer[] memory){
        if (target == 0){
            return 1;
        }

        if (memory[target] != null){
            return memory[target];
        }

        int count = 0;

        for (int i = 1; i <= face && i <= target; i++) {
            count += boardDP(target-i, face, memory);
        }

        memory[target] = count;
        return count;
    }

    public static int boardDPItr(int target, int face, Integer[] memory){
        for (int t = 0; t <= target; t++) {
            if (t == 0){
                memory[t] = 1;
            } else {
                int count = 0;
                for (int i = 1; i <= face && i <= t; i++) {
                    count += memory[t - i];
                }
                memory[t] = count;
            }

        }

        return memory[target];
    }
}
