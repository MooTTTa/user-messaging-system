package com.curso.cleanarch.config;

import com.curso.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.curso.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ){
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
