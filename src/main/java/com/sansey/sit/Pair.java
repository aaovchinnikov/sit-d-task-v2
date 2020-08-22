package com.sansey.sit;

import java.io.PrintStream;

/**
 * Pair of integers.
 * @author Alexander Ovchinnikov
 */
public class Pair {
  /** One integer in pair. */
  private final int first;
  /** The other integer in pair. */
  private final int second;

  /**
   * Main constructor.
   * @param f - one integer in pair
   * @param s - the other integer in pair
   */
  public Pair(final int f, final int s) {
    this.first = f;
    this.second = s;
  }

  /**
   * Prints pair to provided {@link PrintStream} and terminates the current line
   * by writing the line separator string.
   * @param out - {@link PrintStream} where {@link Pair} should be printed to
   */
  public void printTo(final PrintStream out) {
    out.print(this.first);
    out.print(" ");
    out.print(this.second);
    out.println();
  }
}
