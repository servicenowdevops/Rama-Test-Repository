package com.test;

import static org.testng.Assert.assertFalse;

import com.lib.Library;

import static org.junit.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class secondTest {

	@Test
	public void test2() {
		Assert.assertTrue(true, "test is passed");
	}


	@Test
	public void testAdd() {
		Library classUnderTest = new Library();
		Assert.assertTrue(classUnderTest.add(1, 2) == 3, "1+2 should be 3");
	}
}
