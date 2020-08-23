package com.sansey.sit;

import java.io.PrintStream;

/**
 * Result that can be printed to provided {@link PrintStream}.
 * @author Alexander Ovchinnikov
 */
public final class Result {
  /** Pairs to be used as result. */
  private final Pairs pairs;

  /**
   * Main constructor.
   * @param p - {@link Pairs} to be used as result.
   *     Use {@link NotNullPairs} decorator to protect from null
   *     passed as argument
   */
  public Result(final Pairs p) {
    this.pairs = p;
  }

  /**
   * Prints {@link Result} to provided {@link PrintStream}.
   * @param out - {@link PrintStream} where {@link Result} should be printed to
   */
  public void printTo(final PrintStream out) {
    out.println(this.pairs.asList().size());
    for (Pair pair: this.pairs.asList()) {
      pair.printTo(out);
    }
  }
}
