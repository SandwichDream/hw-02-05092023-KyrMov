package com.example.booking_tickets;

import java.util.Objects;

public class TicketModel {

    private int id;
    private String src;
    private String dest;
    private boolean isBooked;

    public TicketModel(int id, String src, String dest, boolean isBooked) {
        this.id = id;
        this.src = src;
        this.dest = dest;
        this.isBooked = isBooked;
    }

    public TicketModel() {

    }

    // Gets

    public int getId() {
        return id;
    }

    public String getSrc() {
        return src;
    }

    public String getDest() {
        return dest;
    }

    public boolean isBooked() {
        return isBooked;
    }

    // Sets

    public void setId(int id) {
        this.id = id;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    // Override

    @Override
    public int hashCode() {
        return Objects.hash(id, src, dest, isBooked);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        TicketModel ticket = (TicketModel) o;
        return isBooked == ticket.isBooked &&
                Objects.equals(id, ticket.id) &&
                Objects.equals(src, ticket.src) &&
                Objects.equals(dest, ticket.dest);
    }

    @Override
    public String toString() {
        return "TicketModel{id = " + id + ", src = " + src + ", dest = " + dest + ", isBooked = " + isBooked + "}";
    }
}
