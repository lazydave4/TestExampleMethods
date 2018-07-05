package com.Dawid;

public class MiddleTable {

    public  int[] findMiddle(int[] nums) {
        if(nums==null ||  nums.length==0){
            throw new EmptyTableExeption2();
        }
        int[] a;
        if (nums.length % 2 == 0) {
            a = new int[2];
            a[0] = nums[(nums.length / 2) - 1];
            a[1] = nums[nums.length / 2];
        } else {
            a = new int[1];
            a[0] = nums[nums.length / 2];
        }
        return a;
    }
}
