package com.dubakovic.fluentnumbers.base;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class NumbersTest {

  @Test
  void testEmpty() {
    assertEquals(0, Numbers.positive().create());
    assertEquals(0, Numbers.negative().create());
  }

  @Test
  void testZero() {
    assertEquals(0, Numbers.positive().zero().create());
    assertEquals(0, Numbers.negative().zero().create());
  }

  @Test
  void testTrailingZeros() {
    assertEquals(5, Numbers.positive().zero().zero().zero().five().create());
    assertEquals(-3, Numbers.negative().zero().zero().zero().three().create());
  }

  @Test
  void testNumbers() {
    assertEquals(1964, Numbers.positive().one().nine().six().four().create());
    assertEquals(-2645, Numbers.negative().two().six().four().five().create());
  }

  @Test
  void testNumberGreaterThanMaxLong() {
    Numbers builder = Numbers.positive().nine();
    IntStream.rangeClosed(1, 19).forEach(v -> builder.four());
    assertThrows(NumberFormatException.class, builder::create);
  }

  @Test
  void testNumberLowerThanMinLong() {
    Numbers builder = Numbers.negative().nine();
    IntStream.rangeClosed(1, 19).forEach(v -> builder.three());
    assertThrows(NumberFormatException.class, builder::create);
  }
}
