package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction junit1 = new jUnitFunction();
		int result = junit1.addNumbers(10,20);
		assertEquals(30,result);
//		fail("Not yet implemented");
	}

}
