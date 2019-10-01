package com.dubakovic.fluentnumbers.base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumbersTest {

  @Test
  void testEmpty() {
    assertEquals(0, Numbers.builder().build());
  }

  @Test
  void testZero() {
    assertEquals(0, Numbers.builder().zero().build());
  }

  @Test
  void testTrailingZeros() {
    assertEquals(5, Numbers.builder().zero().zero().zero().five().build());
  }

  @Test
  void testNumbers() {
    assertEquals(1964, Numbers.builder().one().nine().six().four().build());
  }
}
