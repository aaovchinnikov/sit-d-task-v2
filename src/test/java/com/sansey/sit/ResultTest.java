package com.sansey.sit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class ResultTest {
  @Test
  void testPrintZeroPairs() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    new Result(
      new ValidatedPairs(
        Collections.emptyList()
      )
    ).printTo(
      new PrintStream(baos)
    );
    assertEquals(
      "0" + System.lineSeparator(),
      baos.toString(StandardCharsets.UTF_8)
    );
  }
  
  @Test
  void testPrintTwoPairs() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    new Result(
      new ValidatedPairs(
        Arrays.asList(
          new Pair(1, 2),
          new Pair(3, 4)
        )
      )
    ).printTo(
      new PrintStream(baos)
    );
    assertEquals(
      "2" + System.lineSeparator()
        + "1 2" + System.lineSeparator()
        + "3 4" + System.lineSeparator(),
      baos.toString(StandardCharsets.UTF_8)
    );
  }
}
