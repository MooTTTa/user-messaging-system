package com.curso.cleanarch.dataprovider;

import com.curso.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.curso.cleanarch.core.domain.Address;
import com.curso.cleanarch.dataprovider.client.FindAdressByZipCodeClient;
import com.curso.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAdressByZipCodeClient findAdressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addresResponse = findAdressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addresResponse);
    }
}
