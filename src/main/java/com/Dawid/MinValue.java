package com.Dawid;

public class MinValue {

    public  int getMinValue(int[] numbers) {
        if(numbers==null ||  numbers.length==0){
            throw new EmptyTableExeption();
        }
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}
