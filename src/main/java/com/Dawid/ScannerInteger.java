package com.Dawid;

import java.util.Scanner;

public class ScannerInteger {

    public  int getAnInteger() {
        Scanner scanner = new Scanner(System.in);
        int testValue = 0;
        String line = scanner.nextLine();
        testValue = Integer.parseInt(line);
        if (testValue < 0) {
            throw new NegativeNumberException();
        }
        return testValue;
    }

    public static void main(String[] args) {
        ScannerInteger scannerInteger = new ScannerInteger();
        scannerInteger.getAnInteger();
    }
}