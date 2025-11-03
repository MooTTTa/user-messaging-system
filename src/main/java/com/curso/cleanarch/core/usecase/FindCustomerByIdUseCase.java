package com.curso.cleanarch.core.usecase;

import com.curso.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
