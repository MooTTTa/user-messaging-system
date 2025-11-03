package com.curso.cleanarch.dataprovider.repository.mapper;

import com.curso.cleanarch.core.domain.Address;
import com.curso.cleanarch.dataprovider.repository.entity.AddressEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressEntityMapper {
    AddressEntity toAddressEntity(Address address);
    Address toAddress(AddressEntity addressEntity);
}