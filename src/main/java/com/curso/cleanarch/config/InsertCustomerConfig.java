package com.curso.cleanarch.config;

import com.curso.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.curso.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.curso.cleanarch.dataprovider.InsertCustomerImpl;
import com.curso.cleanarch.dataprovider.SendCpfForvalidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForvalidationImpl sendCpfForvalidation
    ){
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer,sendCpfForvalidation);
    }

}
