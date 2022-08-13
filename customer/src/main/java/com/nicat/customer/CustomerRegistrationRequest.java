package com.nicat.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
