package tickets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class tests the VIPTicket class
 * @author Jacob J
 * @version 1.0
 */
public class VIPTicketTest {
	// Creating new VIPTicket objects

	private static VIPTicket defaultVIP = new VIPTicket();

	
	
	/**
	 * This function tests the getType() function in the VIP class
	 */
	@Test
	public void testgetVIP(){
		assertEquals("VIP", defaultVIP.getType());
	}
	
	/**
	 * This function tests the getFreebies() method of the VIP class
	 */
	@Test
	public void testGetFreebeies(){
		assertEquals("Free Parking", defaultVIP.getFreebies());
		System.out.println(defaultVIP);
	}
	
}