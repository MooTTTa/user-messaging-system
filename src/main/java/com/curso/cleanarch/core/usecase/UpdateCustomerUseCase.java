package com.curso.cleanarch.core.usecase;

import com.curso.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {
    void update(Customer customer, String zipCode);
}
