package com.codingblocks.lecture_13;

public class EggDrop {
    public static void main(String[] args) {
        System.out.println(eggDrop(2, 10));
    }

    public static int eggDrop(int eggs, int floors){
        if (floors == 0){
            return 0;
        }

        if (eggs == 1){
            return floors;
        }

        int minimum = floors;
        for (int f = 1; f <= floors ; f++) {
            int down = eggDrop(eggs-1, f-1);
            int up = eggDrop(eggs, floors - f);

            int max = 1 + Math.max(up, down);

            if (max < minimum){
                minimum = max;
            }
        }

        return minimum;
    }
}
