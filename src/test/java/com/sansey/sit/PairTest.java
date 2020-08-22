package com.sansey.sit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

class PairTest {
  @Test
  void testPrint() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    new Pair(1, 2).printTo(
      new PrintStream(baos)
    );
    assertEquals(
      "1 2" + System.lineSeparator(),
      baos.toString(StandardCharsets.UTF_8)
    );
  }

}
