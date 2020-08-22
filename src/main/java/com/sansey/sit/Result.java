package com.sansey.sit;

import java.io.PrintStream;
import java.util.List;

/**
 * Result that can be printed to provided {@link PrintStream}.
 * @author Alexander Ovchinnikov
 */
public final class Result {
  /** Pairs to be used as result. */
  private final List<Pair> pairs;

  /**
   * Main constructor.
   * @param p - {@link List} of {@link Pair}s to be used as result.
   */
  public Result(final List<Pair> p) {
    if (p == null) {
      throw new IllegalArgumentException("Null passed as argument \"p\" of "
        + "constructor Result(final List<Pair> p). "
        + "Argument \"p\" should be non-null.");
    }
    this.pairs = p;
  }


  /**
   * Prints {@link Result} to provided {@link PrintStream}.
   * @param out - {@link PrintStream} where {@link Result} should be printed to
   */
  public void printTo(final PrintStream out) {
    out.println(pairs.size());
    for (Pair pair: pairs) {
      pair.printTo(out);
    }
  }
}
