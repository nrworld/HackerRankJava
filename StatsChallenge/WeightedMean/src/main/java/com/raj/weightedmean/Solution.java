package com.raj.weightedmean;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] nums = new int[count];
        int[] weight = new int[count];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(scanner.next());
        }
        for (int i = 0; i < weight.length; i++) {
            weight[i] = Integer.parseInt(scanner.next());
        }*/
        int[] nums = new int[]{10,40,30,50,20,10,40,30,50,20,1,2,3,4,5,6,7,8,9,10,20,10,40,30,50,20,10,40,30,50};
        int[] weight = new int[]{1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,10,40,30,50,20,10,40,30,50,20};
        DecimalFormat df = new DecimalFormat("#######.0");
        System.out.println(df.format(weightedMean(nums,weight)));
    }

    private static double weightedMean(int[] nums, int[] weight) {
        double sum = 0;
        long sumWeight = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i] * weight[i];
            sumWeight += weight[i];
        }
        return sum/sumWeight;
    }
}
