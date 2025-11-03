package com.curso.cleanarch.dataprovider;

import com.curso.cleanarch.core.dataprovider.InsertCustomer;
import com.curso.cleanarch.core.domain.Customer;
import com.curso.cleanarch.dataprovider.repository.CustomerRepository;
import com.curso.cleanarch.dataprovider.repository.entity.CustomerEntity;
import com.curso.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
