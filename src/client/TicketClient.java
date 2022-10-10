package client;
import tickets.ticket;

/**
 * The TicketClient class creates two ticket objects and prints them out.
 * @author Jacob J
 * @version 1.0
 */
public class TicketClient {
    /**
     * This function creates two ticket objects and prints them out.
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        ticket one = new ticket();
        System.out.println(one);

        ticket two = new ticket();
        System.out.println(two);
    }
}
