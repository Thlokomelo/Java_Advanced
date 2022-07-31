package com.example.lambda;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class CalcTest {

    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();

        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");

        // Put code here
        Stream<SalesTxn> s1 = tList.stream();       //Create a stream from tList and assign it to: Stream<SalesTxn> s1
        Stream<SalesTxn> s2 = s1.filter( //Create a second stream and assign the results of the filter method for Radio Hut transactions: Stream<SalesTxn> s2
                t -> t.getBuyerName().equals("Radio Hut"));
        DoubleStream s3 = s2.mapToDouble( //Create a third stream and assign the results from a mapToDouble method that returns the transaction total: DoubleStream s3
                t -> t.getTransactionTotal());     //Sum the final stream 
          double t1 = s3.sum();          //assign the result to: double t1.

        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);

    }
}
