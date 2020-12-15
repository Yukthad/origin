package com.sonata.JunitTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SubtractionTest2 {
	
	@Test
	void test() {
				Subtraction sub=new Subtraction();
				assertEquals(-1,sub.sub(5, 6));
	}

	@Test
	public void testSub() {
		fail("Not yet implemented");
	}

}
