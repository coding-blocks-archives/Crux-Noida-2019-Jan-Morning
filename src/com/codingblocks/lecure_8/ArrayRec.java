package com.codingblocks.lecure_8;

import java.util.Arrays;

public class ArrayRec {
    public static void main(String[] args) {
        int[] nums = {77, 7, 7, 65, 54};

        int[] res = findAll(nums, 7, 0, 0);

        System.out.println(Arrays.toString(res));
    }

    public static boolean find(int[] nums, int target, int index){
        if (index == nums.length){
            return false;
        }

        if (nums[index] == target){
            return true;
        }

        return find(nums, target, index + 1);
    }

    public static int findIndex(int[] nums, int target, int index){
        if (index == nums.length){
            return -1;
        }

        if (nums[index] == target){
            return index;
        }

        return findIndex(nums, target, index + 1);
    }

    public static boolean sorted(int[] nums, int index){
        if(index == nums.length - 1){
            return true;
        }

        if(nums[index] > nums[index + 1]){
            return false;
        }

        return sorted(nums, index + 1);
    }

    public static int[] findAll(int[] nums, int target, int index, int count){
        if (index == nums.length){
            int[] sol = new int[count];
            return sol;
        }

        if (nums[index] == target){
            int[] sol = findAll(nums, target, index+1, count + 1);
            sol[count] = index;
            return sol;
        }

        return findAll(nums, target, index+1, count);

    }
}
