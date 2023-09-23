package com.example.booking_tickets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookingTicketsDAO {

    private List<TicketModel> tickets = new ArrayList<>();
    {
        for (int i = 0; i < 7; i++) {
            tickets.add(new TicketModel(i, "scr" + i, "dest" + i, new Random().nextBoolean()));
            // tickets.add(new TicketModel(i, "scr" + i, "dest" + i, true));
        }
    }

    public List<TicketModel> list() {
        return tickets;
    }
}