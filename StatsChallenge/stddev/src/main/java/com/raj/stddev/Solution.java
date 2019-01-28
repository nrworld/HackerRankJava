package com.raj.stddev;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(scanner.next());
        }
        //int[] nums = new int[]{10, 40, 30, 50, 20};
        DecimalFormat df = new DecimalFormat("#######.0");
        System.out.println(df.format(stddev(nums)));
    }

    private static double stddev(int[] nums) {
        double mean = mean(nums);
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.pow(nums[i] - mean, 2.0);
        }
        return Math.sqrt(sum/nums.length);
    }

    private static double mean(int[] nums) {
        double dsum = Arrays.stream(nums).sum();
        return dsum / nums.length;
    }
}
