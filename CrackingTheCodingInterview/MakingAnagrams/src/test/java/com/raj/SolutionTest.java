package com.raj;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void runTest() {
        assertEquals(4, Solution.numberNeeded("abc", "cde"));
    }

}
