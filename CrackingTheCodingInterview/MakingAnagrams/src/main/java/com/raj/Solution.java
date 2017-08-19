package com.raj;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    public static int numberNeeded(String first, String second) {
        Hashtable<Character, Integer> tbl1 = count_frequency(first);
        Hashtable<Character, Integer> tbl2 = count_frequency(second);

        final AtomicInteger removeCount = new AtomicInteger(0);

        List<Character> common = new ArrayList<>();
        tbl1.forEach( (chr, val) -> {
            //tbl2.remove(chr, val);
            tbl2.computeIfPresent(chr, (chr2, val2) -> {
                common.add(chr);
                return removeCount.addAndGet(Math.abs(val2 - val));
            });
            tbl2.remove(chr);
        });

        common.forEach(chr -> tbl1.remove(chr));

        removeCount.addAndGet(
        tbl1.values().stream().mapToInt( i -> i.intValue()).sum());

        removeCount.addAndGet(
                tbl2.values().stream().mapToInt( i -> i.intValue()).sum());

        return removeCount.get();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

    static Hashtable<Character, Integer> count_frequency(String input) {
        Hashtable<Character, Integer> mapFreq = new Hashtable<>();
        char[] chars = input.toCharArray();
        for(Character c: chars) {
            mapFreq.computeIfPresent(c, (chr, val) -> val + 1);
            mapFreq.putIfAbsent(c, 1);
        }
        return mapFreq;
    }
}