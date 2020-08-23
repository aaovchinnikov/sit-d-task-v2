package com.sansey.sit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ValidatedPairsTest {
  @Test
  void testNull() {
    assertThrows(
      IllegalArgumentException.class, 
      () -> { 
        new ValidatedPairs(null).asList();
      }
    );
  }

  @Test
  void testNotNull() {
    List<Pair> origin = Arrays.asList(
        new Pair(1, 2),
        new Pair(3, 4)
    );
    assertEquals(
      origin,
      new ValidatedPairs(origin).asList()
    );
  }
}
