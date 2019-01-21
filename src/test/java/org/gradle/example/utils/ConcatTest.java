package org.gradle.examples.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static junit.framework.Assert.*;

public class ConcatTest {
  @Test
  public void testStringConcatenate() {
    String concatenated = MyConcatenator.concatenate("one", "two", "three", "four");

    assertEquals("one,two,three,four", concatenated);
  }
} 

     

    