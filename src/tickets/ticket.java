package tickets;

import java.text.NumberFormat;
import java.util.Locale;


/**
 * The ticket class is a blueprint for creating ticket objects.
 *
 * The ticket class has three instance variables: cost, owner, and seatNum.
 *
 * The ticket class has three constructors: a default constructor, a parameterized constructor, and a copy constructor.
 *
 * The ticket class has three getters: getCost, getOwner, and getSeatNum.
 *
 * The ticket class has two setters: setCost and setOwner.
 *
 * The ticket class has one method: toString.
 *
 * The ticket class has one class field: seatGen.
 *
 * The ticket class has one class constant: DEFAULT_OWNER.
 *
 * @author Jacob J
 * @version 1.0
 */
public class ticket{
	// Declaring a variable called cost that is of type double and is protected.
	protected double cost;

	// Declaring a variable called owner that is of type String and is protected.
	protected String owner;

	// Declaring a variable called seatNum that is of type int and is protected.
	protected int seatNum;

	

	// A class field.
	private static int seatGen = 1;

	// A class constant.
	protected static final String DEFAULT_OWNER = "Owner";
	



	// Calling the parameterized constructor.
	public ticket(){
		this(50, DEFAULT_OWNER);
	}

	// parameterized constructor - cost owner
	public ticket(double cost, String owner){

		this.cost=cost;
		this.seatNum = seatGen++;
		this.owner = owner;

		// If the owner is the default owner, then the owner is set to the default owner plus the seat number.
		if (this.owner.equals(DEFAULT_OWNER)) {
		this.owner += this.seatNum;
		}
		}

	

	/**
	 * This function returns the cost of the item
	 *
	 * @return The cost of the item.
	 */
	public double getCost() {
		return cost;
	}
	
	/**
	 * This function returns the owner of the car.
	 *
	 * @return The owner of the ticket.
	 */
	public String getOwner() {
		return owner;
	}
	
	/**
	 * This function returns the seat number of the passenger
	 *
	 * @return The seat number of the passenger.
	 */
	public int getSeatNum() {
		return seatNum;
	}


	/**
	 * This function sets the cost of the item.
	 *
	 * @param cost The cost of the item.
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	/**
	 * This function sets the owner of the car.
	 *
	 * @param owner The owner of the ticket.
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	
	/**
	 * The function getType() returns the string "General Admission"
	 *
	 * @return The string "General Admission"
	 */
	public String getType(){
		return "General Admission";
	}

	// Overriding the toString method.
	@Override
	public String toString(){
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		return "\nT|========================" +
				"\nI| SEAT # " + seatNum +
				"\nC| COST: " + formatter.format(cost) + "\n" +
				"K| TYPE: " +getType() + "\n" +
				"E|" +
				"\nT|========================";
		
	}
}
