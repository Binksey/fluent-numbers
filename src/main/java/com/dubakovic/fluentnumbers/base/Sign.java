package com.dubakovic.fluentnumbers.base;

public enum Sign {
  POSITIVE("+"),
  NEGATIVE("-"),
  ;

  private final String value;

  Sign(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
