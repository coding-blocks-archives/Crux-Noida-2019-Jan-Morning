package com.codingblocks.lecture_12;

public class EditDistance {

    public static void main(String[] args) {

    }

    public static int edit_dist(String f, String s, int flen, int slen){
        if (flen == 0){
            return slen;
        }

        if (slen == 0){
            return flen;
        }

        int c = 0;
        if (f.charAt(flen-1) == s.charAt(slen-1)){
            c = edit_dist(f, s, flen-1, slen-1);
        } else {
            int rmf = edit_dist(f, s, flen - 1, slen) + 1;
            int rms = edit_dist(f, s, flen, slen - 1) + 1;
            int replace = edit_dist(f, s, flen - 1, slen - 1) + 1;

            c = Math.min(replace, Math.min(rmf, rms));

        }

        return c;
    }
}
