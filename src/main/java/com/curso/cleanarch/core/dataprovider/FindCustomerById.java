package com.curso.cleanarch.core.dataprovider;

import com.curso.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);
}
