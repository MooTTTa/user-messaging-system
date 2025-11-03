package com.curso.cleanarch.dataprovider;

import com.curso.cleanarch.core.dataprovider.DeleteCustomer;
import com.curso.cleanarch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerImpl implements DeleteCustomer {

    @Autowired
    private CustomerRepository repository;

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
