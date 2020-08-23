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
  private final Skis skis;
  /** Maximal difference to from a pair. */
  private final Delta delta;

  /**
   * Main constructor.
   * @param s - Skis to build pairs from.
   *     Use {@link ValidatedSkis} decorator to validate passed values
   * @param d - Delta to compare skis with.
   *     Use {@link ValidatedDelta} decorator to validate passed values
   */
  public AllPairs(final Skis s, final Delta d) {
    this.skis = s;
    this.delta = d;
  }

  @Override
  public List<Pair> asList() {
    final List<Pair> list = new LinkedList<>();
    for (int i = 0; i < this.skis.asArray().length; i++) {
      for (int j = i + 1; j < this.skis.asArray().length; j++) {
        if (
            Math.abs(
                this.skis.asArray()[i] - this.skis.asArray()[j]
            ) <= this.delta.asInt()
        ) {
          // Indexes in Task starts from 1 instead of 0.
          list.add(new Pair(i + 1, j + 1));
        }
      }
    }
    return Collections.unmodifiableList(list);
  }
}
