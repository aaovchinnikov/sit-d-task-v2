package com.sansey.sit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ValidatedSkisTest {
  @Test
  void testArrayShorterThenRange() {
    assertThrows(
        IllegalArgumentException.class, 
        () -> { 
          new ValidatedSkis(
              new int[0]
          ).asArray();
        }
    );
  }

  @Test
  void testArrayLongerThenRange() {
    assertThrows(
        IllegalArgumentException.class, 
        () -> { 
          new ValidatedSkis(
              new int[210_000]
          ).asArray();
        }
    );
  }
  
  @Test
  void testArrayElemebtLesserThenRange() {
    assertThrows(
        IllegalArgumentException.class, 
        () -> { 
          new ValidatedSkis(
              new int[] {0}
          ).asArray();
        }
    );
  }

  @Test
  void testArrayElementUpperThenRange() {
    assertThrows(
        IllegalArgumentException.class, 
        () -> { 
          new ValidatedSkis(
              new int[] {2_000_000_000}
          ).asArray();
        }
    );
  }
  
  @Test
  void testValidArrayInRange() {
    final int[] array = new int[] {1,2,3};
    assertEquals(
        array,
        new ValidatedSkis(
            array
        ).asArray()
    );
  }
}
