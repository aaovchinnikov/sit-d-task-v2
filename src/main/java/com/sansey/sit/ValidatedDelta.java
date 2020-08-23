package com.sansey.sit;

public final class ValidatedDelta implements Delta {
  /** Start of valid ski length range. */
  private static final int MIN_RANGE = 0;
  /** End of valid ski length range. */
  private static final int MAX_RANGE = 1_000_000_000;
  /** Int value to be encapsulated. */
  private final int delta;

  /**
   * Main constructor.
   * @param d - int to be as Delta value
   */
  public ValidatedDelta(final int d) {
    this.delta = d;
  }

  @Override
  public int asInt() {
    if (!(MIN_RANGE <= this.delta && this.delta <= MAX_RANGE)) {
      throw new IllegalArgumentException(
          "Invalid value of passed delta: "
          + this.delta
          + ". Valid value is in range ["
          + MIN_RANGE
          + ", "
          + MAX_RANGE
          + "] (inclusive)."
      );
    }
    return this.delta;
  }
}
