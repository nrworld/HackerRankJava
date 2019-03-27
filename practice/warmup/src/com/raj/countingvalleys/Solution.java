package com.raj.countingvalleys;

import java.io.IOException;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        final int u = 'U';
        final int d = 'D';

        int count_of_valleys = 0;
        int level = 0;
        int last_level = 0;

        for(int i=0; i< n; i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case u: level++; break;
                case d: level--;
            }
            if(last_level < 0 && level >= 0) {
                count_of_valleys += 1;
            }
            last_level = level;
        }
        return count_of_valleys;
    }

    public static void main(String[] args) throws IOException {

        String s = "DDUUDDUDUUUD";

        int result = countingValleys(s.length(), s);
    }
}
