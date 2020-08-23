package com.sansey.sit;

/**
 * Decorates int array and checks its elements to be inside valid range
 * [1, 1_000_000_000] (inclusive).
 * @author Alexander Ovchinnikov
 */
public final class ValidatedSkis implements Skis {
  /** Start of valid ski length range. */
  private static final int MIN_ARRAY_LENGTH = 1;
  /** End of valid ski length range. */
  private static final int MAX_ARRAY_LENGTH = 200_000;
  /** Start of valid ski length range. */
  private static final int MIN_SKI_LENGTH = 1;
  /** End of valid ski length range. */
  private static final int MAX_SKI_LENGTH = 1_000_000_000;
  /** Encapsulated array. */
  private final int[] skis;

  /**
   * Main constructor.
   * @param array - int array of skis length
   */
  public ValidatedSkis(final int[] array) {
    this.skis = array;
  }

  @Override
  public int[] asArray() {
    if (!(
          MIN_ARRAY_LENGTH <= this.skis.length
          && this.skis.length <= MAX_ARRAY_LENGTH
        )
    ) {
      throw new IllegalArgumentException(
          "Invalid length of passed array: "
          + this.skis.length
          + ". Valid length is in range ["
          + MIN_ARRAY_LENGTH
          + ", "
          + MAX_ARRAY_LENGTH
          + "] (inclusive)."
      );
    }
    for (int i = 0; i < this.skis.length; i++) {
      if (!(MIN_SKI_LENGTH <= this.skis[i] && this.skis[i] <= MAX_SKI_LENGTH)) {
        throw new IllegalArgumentException(
            "Invalid ski length in passed array at element with index "
            + i
            + ": "
            + this.skis[i]
            + ". Valid values are in range ["
            + MIN_SKI_LENGTH
            + ", "
            + MAX_SKI_LENGTH
            + "] (inclusive)."
        );
      }
    }
    return this.skis;
  }

}
