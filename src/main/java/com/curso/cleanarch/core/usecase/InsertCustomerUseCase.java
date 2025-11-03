package com.curso.cleanarch.core.usecase;

import com.curso.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer custumer, String zipCode);
}
