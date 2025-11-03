package com.curso.cleanarch.config;

import com.curso.cleanarch.core.usecase.impl.DeleteCustomerUseCaseImpl;
import com.curso.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.curso.cleanarch.dataprovider.DeleteCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerUseCaseImpl deleteCustomerUseCase(
            DeleteCustomerImpl deleteCustomer,
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase
    ){
        return new DeleteCustomerUseCaseImpl(deleteCustomer, findCustomerByIdUseCase);
    }
}
