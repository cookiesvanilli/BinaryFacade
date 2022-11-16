package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("1110100 + 1100101 = " + bins.sum("1110100", "1100101"));
        System.out.println("1110100 * 1100101 = " + bins.mult("1110100", "1100101"));
    }
}