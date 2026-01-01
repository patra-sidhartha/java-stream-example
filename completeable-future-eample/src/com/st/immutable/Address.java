package com.st.immutable;

public class Address {
    private String contact;
    private String State;

    public Address() {
    }

    public Address(String contact, String state) {
        this.contact = contact;
        State = state;
    }


    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
