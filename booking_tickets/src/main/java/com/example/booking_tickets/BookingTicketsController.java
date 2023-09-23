package com.example.booking_tickets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingTicketsController {

    private BookingTicketsService service = new BookingTicketsService();

    @GetMapping("/tickets")
    public String getTickets() {
        return "All tickets" + System.lineSeparator() + service.getList() + System.lineSeparator() + "Unbooked tickets"
                + System.lineSeparator() + service.getUnbookedList();
    }

    @PostMapping("/tickets")
    public String setTickets(@RequestBody int count) { // count - the number of tickets you want to book
        if (service.bookingTicket(count)) {
            return "The ticket(s) was(were) booked";
        }
        return "Ticket(s) was(were) not booked";
    }
}