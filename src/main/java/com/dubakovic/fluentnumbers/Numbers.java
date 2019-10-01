package com.dubakovic.fluentnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Builder for a number. */
public final class Numbers {
  private final List<Byte> values;

  /**
   * Constructor.
   *
   * @param values list of digits
   */
  private Numbers(List<Byte> values) {
    this.values = Objects.requireNonNull(values);
  }

  /**
   * Creates new builder with no digits.
   *
   * @return new, empty builder
   */
  public static Numbers builder() {
    return new Numbers(new ArrayList<>(Collections.singleton(Digits.ZERO)));
  }

  /**
   * Adds 0 to the current digit sequence.
   *
   * @return this builder instance
   */
  public Numbers zero() {
    this.values.add(Digits.ZERO);
    return this;
  }

  /**
   * Adds 1 to the current digit sequence.
   *
   * @return this builder instance
   */
  public Numbers one() {
    this.values.add(Digits.ONE);
    return this;
  }

  /**
   * Adds 2 to the current digit sequence.
   *
   * @return this builder instance
   */
  public Numbers two() {
    this.values.add(Digits.TWO);
    return this;
  }

  /**
   * Adds 3 to the current digit sequence.
   *
   * @return this builder instance
   */
  public Numbers three() {
    this.values.add(Digits.THREE);
    return this;
  }

  /**
   * Adds 4 to the current digit sequence.
   *
   * @return this builder instance
   */
  public Numbers four() {
    this.values.add(Digits.FOUR);
    return this;
  }

  /**
   * Adds 5 to the current digit sequence.
   *
   * @return this builder instance
   */
  public Numbers five() {
    this.values.add(Digits.FIVE);
    return this;
  }

  /**
   * Adds 6 to the current digit sequence.
   *
   * @return this builder instance
   */
  public Numbers six() {
    this.values.add(Digits.SIX);
    return this;
  }

  /**
   * Adds 7 to the current digit sequence.
   *
   * @return this builder instance
   */
  public Numbers seven() {
    this.values.add(Digits.SEVEN);
    return this;
  }

  /**
   * Adds 8 to the current digit sequence.
   *
   * @return this builder instance
   */
  public Numbers eight() {
    this.values.add(Digits.EIGHT);
    return this;
  }

  /**
   * Adds 9 to the current digit sequence.
   *
   * @return this builder instance
   */
  public Numbers nine() {
    this.values.add(Digits.NINE);
    return this;
  }

  /**
   * Build the final number.
   *
   * @return final number
   */
  public long build() {
    return Long.parseLong(values.stream().map(String::valueOf).collect(Collectors.joining("")));
  }

  @Override
  public String toString() {
    return "Numbers{" + values + "}";
  }
}
