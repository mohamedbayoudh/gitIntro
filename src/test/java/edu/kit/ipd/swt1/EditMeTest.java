package edu.kit.ipd.swt1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author mohamed
 * Class EditMe
 */
public class EditMeTest {

	private EditMe editMe;

	/**
	 * 
	 * @throws Exception 
	 */
	@Before
	public void setUp() throws Exception {
		editMe = new EditMe();
	}

	/**
	 * 
	 * @throws Exception exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test
	 */
	@Test
	public void testMatNum() {
		assertEquals(2082466, editMe.getMatNum());
	}

	/**
	 *  Test
	 */
	@Test
	public void testFoo() {
		assertEquals("bar", editMe.getFoo());
	}
}
