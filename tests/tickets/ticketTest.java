package tickets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class tests the ticket class by creating two new tickets and testing the getter methods
 * @author Jacob J
 * @version 1.0
 */
public class ticketTest {

	// Creating two new tickets.
	private static ticket one = new ticket();
	private static ticket two = new ticket();
	/**
	 * This function tests the getSeatNum() function in the Seat class
	 */
	@Test
	public void testGetSeat(){
		assertEquals(1,one.getSeatNum());
		assertEquals(2,two.getSeatNum());
	}
	
	/**
	 * This function tests the getOwner() function in the Dog class
	 */
	@Test
	public void testGetOwner(){
		assertEquals("Owner1", one.getOwner());
		assertEquals("Owner2", two.getOwner());
	}
	
	/**
	 * This function tests the getType() function in the Ticket class
	 */
	@Test
	public void testGetType(){
		assertEquals("General Admission", one.getType());
		assertEquals("General Admission", two.getType());
	}
	
	/**
	 * This function tests the getCost() method in the class
	 */
	@Test
	public void testGetCost(){
		assertEquals(50.0, one.getCost(), 0.0);
		assertEquals(50.0, two.getCost(), 0.0);
	}
}