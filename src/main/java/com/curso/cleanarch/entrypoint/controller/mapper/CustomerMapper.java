package com.curso.cleanarch.entrypoint.controller.mapper;

import com.curso.cleanarch.core.domain.Customer;
import com.curso.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.curso.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true) // será preenchido no UseCase
    @Mapping(target = "validCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomer(Customer customer);
}