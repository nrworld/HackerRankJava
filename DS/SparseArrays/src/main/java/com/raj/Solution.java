package com.raj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter no. of Strings : ");
        int no_of_strings = scanner.nextInt();
        List<String> instrings = new ArrayList<>();
        for(int i=1; i<=no_of_strings; i++) {
            //System.out.print("Enter String no. " + i + " : ");
            instrings.add(scanner.next());
        }
        List<String> qrystrings = new ArrayList<>();
        //System.out.print("Enter no. of Queries : ");
        int no_of_queries = scanner.nextInt();
        for(int i=1; i<=no_of_queries; i++) {
            //System.out.print("Enter Query String no. " + i + " : ");
            qrystrings.add(scanner.next());
        }

        findInSrcString(instrings, qrystrings).forEach(System.out::println);
    }

    public static List<Long> findInSrcString(List<String> sourceString,
                                                List<String> queryStrings) {
        return queryStrings.stream().map(qry -> sourceString.stream().filter(qry::equals).count()).collect(Collectors.toList());
    }
}