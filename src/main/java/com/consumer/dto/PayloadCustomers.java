package com.consumer.dto;

public class PayloadCustomers {
    private Customers before;
    private Customers after;

    public Customers getBefore() {
        return before;
    }

    public void setBefore(Customers before) {
        this.before = before;
    }

    public Customers getAfter() {
        return after;
    }

    public void setAfter(Customers after) {
        this.after = after;
    }
}
