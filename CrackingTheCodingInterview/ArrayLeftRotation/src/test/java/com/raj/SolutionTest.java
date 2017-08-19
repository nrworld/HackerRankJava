package com.raj;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void runTest() {
        int[] input = new int[] { 1, 2, 3, 4, 5};
        Solution.rotate(input, 4);
        int[] output = new int[] { 5, 1, 2, 3, 4};
        for(int i=0; i<input.length; i++) {
            assertTrue(input[i] == output[i]);
        }
    }

    @Test
    public void runTest1() {
        int[] input = new int[] { 41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
        Solution.rotate(input, 10);
        int[] output = new int[] { 77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77};
        for(int i=0; i<input.length; i++) {
            assertTrue(input[i] == output[i]);
        }
    }
}
