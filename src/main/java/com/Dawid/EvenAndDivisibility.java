package com.Dawid;

public class EvenAndDivisibility {

    public boolean evenOdd(int numbers) {
        boolean result = false;
        if (numbers % 2 == 0) {
            result=true;
        }
           return result;
        }
    public boolean isDivisibleBy5(int numbers) {
        boolean result = false;
        if (numbers % 5 == 0) {
            result=true;
        }
            return result;
    }
    public boolean isDivisibleBy10(int numbers) {
        boolean result = false;
        if (numbers % 10 == 0) {
            result=true;
        }
            return result;
        }
}




