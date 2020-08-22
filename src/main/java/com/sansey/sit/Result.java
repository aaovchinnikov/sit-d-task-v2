package com.sansey.sit;

import java.io.PrintStream;

/**
 * Result that can be printed to provided {@link PrintStream}.
 * @author Alexander Ovchinnikov
 */
public final class Result {
  /**
   * Prints {@link Result} to provided {@link PrintStream}.
   * @param out - {@link PrintStream} where {@link Result} should be printed to
   */
  public void printTo(final PrintStream out) {
    out.println("Result");
  }
}
