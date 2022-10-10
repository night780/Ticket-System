package client;
import tickets.VIPTicket;
import tickets.ticket;
import java.util.ArrayList;

/**
 * The TicketTester class creates an ArrayList of tickets, fills it with 20 tickets (10 VIP and 10 general admission), and
 * then prints out the details of each ticket
 * @author Jacob J
 * @version 1.0
 */
public class TicketTester {
// The number of tickets to be generated.
private static final int NUM_OF_TICKETS = 20;

    /**
     * This function generates a list of tickets and prints them out
     * @param args The command line arguments
     */
    public static void main(String[] args){
        // Creating an ArrayList of tickets with a size of 20.
        ArrayList<ticket> ticketList = new ArrayList<>(NUM_OF_TICKETS);

        // Calling the generateTickets function and passing the ticketList ArrayList as an argument.
        generateTickets(ticketList);

        // Calling the printTickets function and passing the ticketList ArrayList as an argument.
        printTickets(ticketList);

    }
    /**
     * This function generates a list of tickets, 10% of which are VIP tickets
     *
     * @param list The list of tickets that we are going to generate.
     */
    private static void generateTickets(ArrayList<ticket> list){

        // Calculating the number of VIP tickets that should be generated.
        final int VIP_TICKET_COUNT = Math.round(NUM_OF_TICKETS * 0.10f);

        // Calculating the number of general admission tickets that should be generated.
        final int GENERAL_TICKET_COUNT = NUM_OF_TICKETS - VIP_TICKET_COUNT;

        for(int i =0; i<GENERAL_TICKET_COUNT;i++){
            // Creating a new ticket object and adding it to the list.
            list.add(new ticket());
        }
        for(int i =0; i<VIP_TICKET_COUNT;i++){

            // Creating a new VIPTicket object and adding it to the list.
            list.add(new VIPTicket());
        }

    }
/**
 * For each ticket in the list, print the ticket.
 *
 * @param list the list of tickets to print
 */
private static void printTickets(ArrayList<ticket> list){

    // A for each loop that iterates through the list and assigns each element to the variable ticket.
    for(ticket ticket: list){
            System.out.println(ticket.toString());
        }
}

}