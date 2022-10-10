package tickets;


/**
 * The VIPTicket class is a subclass of the Ticket class. It has a default constructor and a parameterized constructor. It
 * has a getter and setter for the freebies instance field. It has a getType method that returns the type of ticket. It has
 * a toString method that returns a string representation of the ticket
 *
 * @author Jacob J
 * @version 1.0
 */
public class VIPTicket  extends ticket{

	//instance fields
	private String freebies; //Free Parking
	
	//Constructors
	//default constructor
	public VIPTicket(){

// Calling the parameterized constructor with the values 150.00, DEFAULT_OWNER, and "Free Parking"
this(150.00,DEFAULT_OWNER,"Free Parking");
	}


	/**
	 * 	This is a parameterized constructor that takes in a double, a string, and a string. It calls the superclass constructor
	 * 	with the cost and owner. It then sets the freebies instance field to the freebies parameter.
	 * @param cost cost of the ticket
	 * @param owner owner of the ticket
	 * @param freebies freebies of the ticket
	 */

	public VIPTicket (double cost, String owner,String freebies){
		super(cost,owner);
		this.freebies = freebies;
	}
	
	

	/**
	 * This function returns the freebies of the user
	 *
	 * @return The freebies variable is being returned.
	 */
	public String getFreebies() {
		return freebies;
	}

	
	/**
	 * It returns the type of the customer.
	 *
	 * @return The string "VIP"
	 */
	@Override
	public String getType(){
		return"VIP";
	}
	

	/**
	 * The function first calls the superclass's toString() function, which returns a string containing the superclass's
	 * information. The function then splits the string at the point where the superclass's information ends and the
	 * subclass's information begins, and inserts the subclass's information into the string
	 *
	 * @return The toString method is being overridden to include the freebies variable.
	 */
	@Override
	public String toString(){
	String output = super.toString();

	int splitIndex = output.indexOf("E| ") + 3;

		return output.substring(0,splitIndex)+freebies+output.substring(splitIndex);
	}

	/**
	 * This function sets the freebies of the customer
	 *
	 * @param freebies The freebies that the user has.
	 */
	public void setFreebies(String freebies){this.freebies = freebies;}
	
}
