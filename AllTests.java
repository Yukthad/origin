package com.sonata.JunitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SubtractionTest.class,SubtractionTest2.class })
public class AllTests {

}
