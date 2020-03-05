package com.knoldus;

import java.util.Optional;

class Address {
    String primaryAddress;
    Optional<String> secondaryAddress;

    public Address(String primaryAddress, Optional<String> secondaryAddress) {
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = secondaryAddress;
    }

    @Override
    public String toString() {
        return "Address{"
                + "primaryAddress='" + primaryAddress + '\''
                + ", secondaryAddress=" + secondaryAddress
                + '}';
    }
}
