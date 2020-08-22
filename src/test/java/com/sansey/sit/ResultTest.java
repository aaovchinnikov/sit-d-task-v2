package com.sansey.sit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

class ResultTest {
  @Test
  void test() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    new Result().printTo(
      new PrintStream(baos)
    );
    assertEquals(
      "Result" + System.lineSeparator(),
      baos.toString(StandardCharsets.UTF_8)
    );
  }
}
