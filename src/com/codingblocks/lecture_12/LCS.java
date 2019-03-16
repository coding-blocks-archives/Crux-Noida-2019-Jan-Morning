package com.codingblocks.lecture_12;

public class LCS {
    public static void main(String[] args) {
        String f = "aman";
        String s = "manan";
        System.out.println(lcs(f, s, f.length(), s.length()));
    }

    public static int lcs(String f, String s, int flen, int slen){
        if (flen ==0 || slen == 0){
            return 0;
        }

        int count = 0;
        if (f.charAt(flen-1) == s.charAt(slen-1)){
            count =  1 + lcs(f, s, flen-1, slen-1);
        } else {
            int left = lcs(f, s, flen - 1, slen);
            int right = lcs(f, s, flen, slen - 1);
            count = Math.max(left,right);
        }

        return count;
    }

    public static int lcsDP(String f, String s, int flen, int slen, Integer[][] memory){
        if (flen ==0 || slen == 0){
            return 0;
        }

        if (memory[flen][slen] != null){
            return memory[flen][slen];
        }

        int count = 0;
        if (f.charAt(flen-1) == s.charAt(slen-1)){
            count =  1 + lcsDP(f, s, flen-1, slen-1, memory);
        } else {
            int left = lcsDP(f, s, flen - 1, slen, memory);
            int right = lcsDP(f, s, flen, slen - 1, memory);
            count = Math.max(left,right);
        }

        memory[flen][slen] = count;

        return count;
    }

    public static int lcsDPItr(String f, String s, int flen, int slen, Integer[][] memory){
        for (int i = 0; i <= flen; i++) {
            for (int j = 0; j <= slen; j++) {
                if (i == 0 || j == 0){
                    memory[i][j] = 0;
                } else {
                    int count = 0;
                    if (f.charAt(i-1) == s.charAt(j-1)){
                        count = 1 + memory[i-1][j-1];
                    } else {
                        count = Math.max(memory[i-1][j], memory[i][j-1]);
                    }
                    memory[i][j] = count;
                }
            }
        }

        return memory[flen][slen];
    }

}
