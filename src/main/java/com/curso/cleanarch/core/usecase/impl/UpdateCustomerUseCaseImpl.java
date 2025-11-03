package com.curso.cleanarch.core.usecase.impl;

import com.curso.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.curso.cleanarch.core.dataprovider.FindCustomerById;
import com.curso.cleanarch.core.dataprovider.UpdateCustomer;
import com.curso.cleanarch.core.domain.Customer;
import com.curso.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.curso.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.curso.cleanarch.dataprovider.repository.entity.CustomerEntity;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(
            FindAddressByZipCode findAddressByZipCode,
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            UpdateCustomer updateCustomer

    ){
        this.findAddressByZipCode = findAddressByZipCode;
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
