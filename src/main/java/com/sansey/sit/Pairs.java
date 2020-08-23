package com.sansey.sit;

import java.util.List;

/**
 * Represents a collection of {@link Pair} elements.
 * @author Alexander Ovchinnikov
 */
public interface Pairs {
  /**
   * Returns {@link List} representation of current {@link Pairs}.
   * @return {@link List} representation of current {@link Pairs}.
   */
  List<Pair> asList();
}
