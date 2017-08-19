package com.raj;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        rotate(a, k);
        for(int i: a) {
            System.out.print(i + " ");
        }
    }

    static void rotate(int[] input, int num_rotate) {
        int rotate = input.length % num_rotate;
        if(rotate == 0) {
            rotate = num_rotate;
        }
        int items2shift = input.length - rotate;

        int[] rotation_arr = new int[rotate];
        if(num_rotate == 0) return;
        if(num_rotate < 0) { // rotate right
            System.arraycopy(input, 0, rotation_arr, 0, rotate);
            System.arraycopy(input, rotate, input, 0, items2shift);
            System.arraycopy(rotation_arr, 0, input, items2shift, rotation_arr.length);
        } else { // rotate left
            System.arraycopy(input, items2shift, rotation_arr, 0, rotate);
            System.arraycopy(input, 0, input, rotate, items2shift);
            System.arraycopy(rotation_arr, 0, input, 0, rotation_arr.length);
        }
    }
}