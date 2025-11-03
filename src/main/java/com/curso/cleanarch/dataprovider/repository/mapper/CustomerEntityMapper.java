package com.curso.cleanarch.dataprovider.repository.mapper;

import com.curso.cleanarch.core.domain.Customer;
import com.curso.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
    Customer toCustomer(CustomerEntity customerEntity);
}
