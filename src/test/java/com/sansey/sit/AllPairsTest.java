package com.sansey.sit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

class AllPairsTest {

  @Test
  void testNoPairs() {
    ByteArrayOutputStream expected = new ByteArrayOutputStream();
    new Pair(1, 2).printTo(new PrintStream(expected));
    List<Pair> list = new AllPairs(
        new ValidatedSkis(
            new int[] {1, 2}
        ),
        new ValidatedDelta(0)
    ).asList();
    assertEquals(0, list.size());
  }

  @Test
  void testPairOfTwo() {
    ByteArrayOutputStream expected = new ByteArrayOutputStream();
    new Pair(1, 2).printTo(new PrintStream(expected));
    List<Pair> list = new AllPairs(
        new ValidatedSkis(
            new int[] {1, 2}
        ),
        new ValidatedDelta(1)
    ).asList();
    for(Pair pair : list) {
      ByteArrayOutputStream actual = new ByteArrayOutputStream();
      pair.printTo(new PrintStream(actual));
      assertEquals(
          expected.toString(StandardCharsets.UTF_8),
          actual.toString(StandardCharsets.UTF_8)
      );
    }
  }
  
  @Test
  void testThreePairs() {
    List<Pair> list = new AllPairs(
        new ValidatedSkis(
            new int[] {1, 2, 3}
        ),
        new ValidatedDelta(2)
    ).asList();
    assertEquals(3, list.size());
  }
}
