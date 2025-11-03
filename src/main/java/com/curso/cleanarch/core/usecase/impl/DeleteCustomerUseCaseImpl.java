package com.curso.cleanarch.core.usecase.impl;

import com.curso.cleanarch.core.dataprovider.DeleteCustomer;
import com.curso.cleanarch.core.usecase.DeleteCustomerUseCase;
import com.curso.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerUseCaseImpl implements DeleteCustomerUseCase {

    private final DeleteCustomer deleteCustomer;

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    public DeleteCustomerUseCaseImpl(DeleteCustomer deleteCustomer,
                                     FindCustomerByIdUseCase findCustomerByIdUseCase){
        this.deleteCustomer = deleteCustomer;
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
    }

    @Override
    public void delete(String id) {

        findCustomerByIdUseCase.find(id);

        deleteCustomer.delete(id);
    }
}
