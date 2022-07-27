package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author oracle
 */
public class BiPredicateTest {

    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();
        Employee first = eList.get(0);
        String searchState = "KS";

        //lambda expression to compare a field in the employee class to a string
        BiPredicate<Employee, String> eBiPred
                = (e, s) -> e.getState().equals(s);

        System.out.println("=== Print matching list");
        for (Employee e : eList) {
            //expression to perform the logical test in the for loop.
            if (eBiPred.test(e, searchState)) {// Use BiPredicate for test
                e.printSummary();
            }
        }
    }
}
