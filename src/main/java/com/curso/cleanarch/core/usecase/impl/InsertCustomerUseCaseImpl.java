package com.curso.cleanarch.core.usecase.impl;

import com.curso.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.curso.cleanarch.core.dataprovider.InsertCustomer;
import com.curso.cleanarch.core.dataprovider.SendCpfForValidation;
import com.curso.cleanarch.core.domain.Customer;
import com.curso.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustomer insertCustumer;
    private final SendCpfForValidation sendCpfForValidation;

    public InsertCustomerUseCaseImpl(
            FindAddressByZipCode findAddressByZipCode,
            InsertCustomer insertCustumer,
            SendCpfForValidation sendCpfForValidation
    ){
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustumer = insertCustumer;
        this.sendCpfForValidation = sendCpfForValidation;
    }


    @Override
    public void insert(Customer custumer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        custumer.setAddress(address);
        insertCustumer.insert(custumer);
        sendCpfForValidation.send(custumer.getCpf());
        System.out.println("Customer salvo: " + custumer);
    }
}
