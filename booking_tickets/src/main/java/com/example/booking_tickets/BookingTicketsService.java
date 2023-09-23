package com.example.booking_tickets;

import java.util.ArrayList;
import java.util.List;

public class BookingTicketsService {

    private List<TicketModel> tickets = new BookingTicketsDAO().list();
    private int countUnbooked;

    public String getList() {
        return toString(tickets);
    }

    public String getUnbookedList() {

        List<TicketModel> unbookedList = new ArrayList<>();
        int count = 0;

        for (TicketModel ticket : tickets) {

            if (!ticket.isBooked()) {

                count++;
                unbookedList.add(ticket);
            }
        }

        countUnbooked = count;
        return toString(unbookedList);
    }

    public Boolean bookingTicket(int count) {

        if (countUnbooked >= count && count != 0) {

            for (TicketModel ticket : tickets) {

                if (!ticket.isBooked() && count != 0) {

                    ticket.setIsBooked(true);
                    count--;
                }
            }
            return true;
        }
        return false;
    }

    public String toString(List<TicketModel> list) {
        String string = "";
        for (TicketModel ticketModel : list) {
            string += ticketModel + System.lineSeparator();
        }
        return string;
    }
}
