package com.sansey.sit;

/**
 * Starting point of application.
 * @author Alexander Ovchinnikov
 */
public final class Main {
  private Main() {
    // Checkstyle. Utility classes should not have
    // a public or default constructor.
  }

  /**
   * The main() method - starting point of application.
   * @param args - command-line arguments of application
   */
  public static void main(final String[] args) {
    new Result(
        new NotNullPairs(null)
    ).printTo(
        System.out
    );
  }
}
