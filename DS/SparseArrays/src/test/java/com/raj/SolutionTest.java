package com.raj;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void runTest() {
        List<String> instrings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> qrystrings = Arrays.asList("aba", "xzxb", "ab");
        Solution.findInSrcString(instrings, qrystrings).forEach(System.out::println);
    }
}
