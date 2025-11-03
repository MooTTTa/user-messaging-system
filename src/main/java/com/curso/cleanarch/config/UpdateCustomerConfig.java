package com.curso.cleanarch.config;

import com.curso.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.curso.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.curso.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.curso.cleanarch.dataprovider.FindCustomerByIdImpl;
import com.curso.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            UpdateCustomerImpl updateCustomer
    ){
        return new UpdateCustomerUseCaseImpl(findAddressByZipCode, findCustomerByIdUseCase, updateCustomer);
    }
}
