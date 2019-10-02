package com.dubakovic.fluentnumbers.base;

import static java.util.Objects.requireNonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/** Builder for a number. */
public final class Numbers {
  private final Sign sign;
  private final List<Byte> values;

  /**
   * Constructor.
   *
   * @param sign number sign (positive, or negative)
   * @param values list of digits
   */
  private Numbers(Sign sign, List<Byte> values) {
    this.sign = requireNonNull(sign);
    this.values = requireNonNull(values);
  }

  /**
   * Creates new builder for a positive number with 0 as a current value.
   *
   * @return new builder for a positive number
   */
  public static Numbers positive() {
    return new Numbers(Sign.POSITIVE, new ArrayList<>(Collections.singletonList(Digits.ZERO)));
  }

  /**
   * Creates new builder for a negative number with 0 as a current value.
   *
   * @return new builder for a negative number
   */
  public static Numbers negative() {
    return new Numbers(Sign.NEGATIVE, new ArrayList<>(Collections.singletonList(Digits.ZERO)));
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
   * Creates the final number.
   *
   * @return final number
   * @throws NumberFormatException in case the final number exceeds the limits of long type
   */
  public long create() {
    return Long.parseLong(
        sign.getValue() + values.stream().map(String::valueOf).collect(Collectors.joining("")));
  }

  @Override
  public String toString() {
    return "Numbers{" + values + "}";
  }
}
