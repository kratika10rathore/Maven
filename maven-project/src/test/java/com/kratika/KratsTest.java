package com.kratika;

import static org.junit.Assert.*;

import org.junit.Test;

public class KratsTest {

	@Test
	public void testAddNumbers() {
           SampleMath myMath = new SampleMath();
           int result = myMath.addNumbers(10, 3);
   
  // Compare expected to result from
  // the method under test
           assertEquals(13, result);
}
}
