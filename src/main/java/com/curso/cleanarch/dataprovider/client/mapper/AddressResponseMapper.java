package com.curso.cleanarch.dataprovider.client.mapper;


import com.curso.cleanarch.core.domain.Address;
import com.curso.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);

}
