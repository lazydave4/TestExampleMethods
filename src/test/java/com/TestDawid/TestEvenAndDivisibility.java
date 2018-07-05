package com.TestDawid;

import com.Dawid.EvenAndDivisibility;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEvenAndDivisibility {

@Test
public void evenOdd_TestEven(){

    EvenAndDivisibility even = new EvenAndDivisibility();
    assertEquals("10 is a even number", true, even.evenOdd(10));

  }
  @Test
  public void evenOdd_TestOdd(){

    EvenAndDivisibility even = new EvenAndDivisibility();
    assertEquals("9 is a odd number", false, even.evenOdd(9));

  }
  @Test
  public void divisibility_TestBy5(){

    EvenAndDivisibility divisibility = new EvenAndDivisibility();
    assertEquals("10 is a divisibility number 5", true, divisibility.isDivisibleBy5(10));

  }
  @Test
  public void divisibility_TestBy5false(){

    EvenAndDivisibility divisibility = new EvenAndDivisibility();
    assertEquals("11 is no divisibility number 5", false, divisibility.isDivisibleBy5(11));
  }
  @Test
  public void divisibility_TestBy10true(){

    EvenAndDivisibility divisibility = new EvenAndDivisibility();
    assertEquals("20 is a divisibility number 10", true, divisibility.isDivisibleBy10(20));

  }
  @Test
  public void divisibility_TestBy10false(){

    EvenAndDivisibility divisibility = new EvenAndDivisibility();
    assertEquals("21 is no divisibility number 10", false, divisibility.isDivisibleBy10(21));

  }
}
