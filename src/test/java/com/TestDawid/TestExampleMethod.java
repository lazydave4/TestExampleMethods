package com.TestDawid;

import com.Dawid.*;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class TestExampleMethod {

    @Test
    public void test_exponentiation() {

        ExampleMethod exponentiation = new ExampleMethod();
        assertEquals(4, exponentiation.square(2, 2));
    }

    @Test
    public void test_exponentiationZero() {
        ExampleMethod exampleMethod = new ExampleMethod();
        assertEquals(1, exampleMethod.square(0, 0));
    }

    @Test
    public void test_shouldBeMinValue() {
        int[] array = new int[]{3, 2, 1, 58, 47, 229, 40};
        MinValue minimum = new MinValue();
        int minValue = minimum.getMinValue(array);
        assert (minValue == 1);
    }

    @Test(expected = EmptyTableExeption.class)
    public void test_shouldBeEmptyValue() {
        MinValue minimum = new MinValue();
        minimum.getMinValue(new int[]{});
    }

    @Test(expected = EmptyTableExeption.class)
    public void test_shouldBeNull() {
        MinValue minimum = new MinValue();
        minimum.getMinValue(null);
    }

    @Test(expected = EmptyTableExeption2.class)
    public void test_middleEmptyArray() {
        MiddleTable middle = new MiddleTable();
        middle.findMiddle(new int[]{});

    }

    @Test(expected = EmptyTableExeption2.class)
    public void test_middleNullArray() {
        MiddleTable middle = new MiddleTable();
        middle.findMiddle(null);

    }

    @Test
    public void test_middleArrayCorrect() {
        int[] array = new int[]{3, 2, 1, 58, 47, 229, 40, 2};
        MiddleTable middle = new MiddleTable();
        int[] testMiddle = middle.findMiddle(array);
        assertArrayEquals(new int[]{58, 47}, testMiddle);
    }
    @Test
    public void test_middleArrayCorrect2() {
        int[] array = new int[]{3, 2, 1, 58, 47, 229, 40};
        MiddleTable middle = new MiddleTable();
        int[] testMiddle = middle.findMiddle(array);
        assertArrayEquals(new int[]{58}, testMiddle);
    }
    @Test
    public void testWithEmptyString() {
        Set<String> output = Duplicates.printDuplicates(Collections.singletonList(""));
        assertEquals(Collections.emptySet(), output);
    }

    @Test
    public void testWithNullString() {
        Set<String> output = Duplicates.printDuplicates(Collections.singletonList(null));
        assertEquals(Collections.emptySet(), output);
    }

    @Test
    public void testWithOutDuplicates() {
        Set<String> output = Duplicates.printDuplicates(Collections.singletonList("one two three"));
        assertEquals(Collections.emptySet(), output);
    }
    @Test
    public void testWithDuplicateString() {
        List<String> aListCollection = new ArrayList<String>();
        aListCollection.add("a");
        aListCollection.add("a");
        aListCollection.add("a");
        aListCollection.add("b");
        aListCollection.add("b");
        Set<String> set =new HashSet<>();
        set.add("a");
        set.add("b");
        Duplicates list = new Duplicates();
        Set <String> test = list.printDuplicates(aListCollection);
        assertEquals(set,test);
    }
    }

