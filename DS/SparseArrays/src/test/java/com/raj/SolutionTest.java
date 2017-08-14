package com.raj;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void runTest() {
        List<String> instrings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> qrystrings = Arrays.asList("aba", "xzxb", "ab");
        List<Long> result = Solution.findInSrcString(instrings, qrystrings);
        assertTrue(result.contains(0) && result.contains(1) && result.contains(2));
    }
}
