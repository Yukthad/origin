package com.sonata.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubtractionTest {
	
	@BeforeEach
	void JustInitialise() {
		System.out.println("Setup before");
	}
	
	
	@AfterEach
	void JustPrint() {
		System.out.println("Teardown After");
	}

	
	@BeforeAll
	void JustInitialise1() {
		System.out.println("Setup");
	}
	
	@AfterAll
	void JustPrint1() {
		System.out.println("Teardown");
	}
	
	@Test
	void test() {
				Subtraction sub=new Subtraction();
				assertEquals(-1,sub.sub(5, 6));
	}

	
	@Test
	void test1() {
		Subtraction sub=new Subtraction();
		assertEquals(0,sub.sub(6, 6));
	}
	
	@Test
	void test2() {
		Subtraction sub=new Subtraction();
		assertEquals(10,sub.sub(15, 5));
	}

}
