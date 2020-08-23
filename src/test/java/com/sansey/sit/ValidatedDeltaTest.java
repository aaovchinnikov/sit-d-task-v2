package com.sansey.sit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidatedDeltaTest {
  @Test
  void testDeltaLowerThenRange() {
    assertThrows(
        IllegalArgumentException.class, 
        () -> { 
          new ValidatedDelta(-1).asInt();
        }
    );
  }

  @Test
  void testDeltaUpperThenRange() {
    assertThrows(
        IllegalArgumentException.class, 
        () -> { 
          new ValidatedDelta(2_000_000_000).asInt();
        }
    );
  }
  
  @Test
  void testDeltaInRange() {
    final int five = 5;
    assertEquals(five, new ValidatedDelta(five).asInt());
  }
}
