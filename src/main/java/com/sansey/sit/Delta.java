package com.sansey.sit;

/**
 * Represents a delta, used to compare skis among each other
 * to form a {@link Pair}.
 * @author Alexander Ovchinnikov
 */
public interface Delta {
  /**
   * Returns int representation of current delta.
   * @return - int representation of current delta
   */
  int asInt();
}
