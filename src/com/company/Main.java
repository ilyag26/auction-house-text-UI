package com.company;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        SQL s = new SQL();
        SQL2 s2 = new SQL2();
        SQL3 s3 = new SQL3();
        Print print = new Print();
        bids b = new bids();
        Close_aucion close = new Close_aucion();
        //methods print
        print.menu();
        print.print6();
        print.print();
        print.print2();
        print.print3();
        print.print4();
        print.print5();
        print.print6();
        //

        s.bd();
        s2.bd2();
        s3.bd3();
        b.bids();
        close.close();
    }
}

