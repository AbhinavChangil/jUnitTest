package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junit2 = new jUnitFunction();
		String result = junit2.addString("The","Abhinav");
		assertEquals("TheAbhinav",result);
//		fail("Not yet implemented");
	}

}
