package com.sansey.sit;

import java.util.List;

/**
 * Collection that encapsulates {@link List} of {@link Pair} elements
 * and checks that encapsulated list is not null.
 * @author Alexander Ovchinnikov
 */
public class NotNullPairs implements Pairs {
  /** Encapsulated list. */
  private final List<Pair> list;

  /**
   * Main constructor.
   * @param l - {@link List} to be encapsulated.
   */
  public NotNullPairs(final List<Pair> l) {
    this.list = l;
  }

  /**
   * Returns encapsulated {@link List} of {@link Pair}
   * elements if is't not <code>null</code>.
   * @return encapsulated {@link List} of {@link Pair} elements
   * @throws IllegalArgumentException
   *     if encapsulated {@link List} is <code>null</code>
   */
  @Override
  public List<Pair> asList() {
    if (list == null) {
      throw new IllegalArgumentException("Null passed as argument \"l\" of "
        + "constructor NotNullPairs(final List<Pair> l). "
        + "Argument \"l\" should be non-null.");
    } else {
      return list;
    }
  }
}
