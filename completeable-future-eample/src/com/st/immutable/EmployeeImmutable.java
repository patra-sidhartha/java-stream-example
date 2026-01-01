package com.st.immutable;

final public class EmployeeImmutable {
    private final Address add;

    public EmployeeImmutable(Address add) {
        this.add = new Address(add.getContact(), add.getState());
    }

    public Address getAdd() {
        return new Address(add.getContact(), add.getState());
    }
}
