package com.Dawid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

    public static Set<String> printDuplicates(List<String> list) {
        Set<String> setReturn = new HashSet<>();
        Set<String> set1 = new HashSet<>();
        for (String yourString : list) {
            if (!set1.add(yourString)) {
                setReturn.add(yourString);
            }
        }
        return  setReturn;
    }
    public  Set<String> findDuplicates2(List<String> list) {
        List<String> copy = new ArrayList<String>(list);
        for (String value : new HashSet<String>(list)) {
            copy.remove(value);
        }
        return new HashSet<String>(copy);
    }
}
