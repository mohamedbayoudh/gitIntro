package edu.kit.ipd.swt1;

import static org.junit.Assert.assertNotNull;


import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author mohamed
 *
 */
public class SimpleEditMeTest {

	private EditMe editMe;

	/**
	 * 
	 * @throws Exception exception
	 */
	@Before
	public void setUp() throws Exception {
		editMe = new EditMe();
	}

	/**
	 * 
	 */
	@Test
	public void test() {
		assertNotNull(editMe.getFoo());
	}
}
