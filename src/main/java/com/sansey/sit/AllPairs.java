package com.sansey.sit;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents all possible {@link Pair}s built from array of ski sizes,
 * where pair is formed between skies, whose sizes differs less or equal
 * to provided {@link #delta}. All pairs are truly unique:
 * for any different <b>a</b> and <b>b</b> ski there is only
 * (a,b)-pair; (b,a)-pair, (a,a)-pair or (b,b)-pair are not included.
 * @author Alexander Ovchinnikov
 */
public final class AllPairs implements Pairs {
  /** Skis to build pairs from. */
  private final int[] skis;
  /** Maximal difference to from a pair. */
  private final int delta;

  /**
   * Main constructor.
   * @param array - int array of skis length
   * @param d - maximal difference of skis to form a pair
   */
  public AllPairs(final int[] array, final int d) {
    this.skis = array;
    this.delta = d;
  }

  @Override
  public List<Pair> asList() {
    final List<Pair> list = new LinkedList<>();
    for (int i = 0; i < this.skis.length; i++) {
      for (int j = i + 1; j < this.skis.length; j++) {
        if (Math.abs(this.skis[i] - this.skis[j]) <= this.delta) {
          list.add(new Pair(i, j));
        }
      }
    }
    return Collections.unmodifiableList(list);
  }
}
