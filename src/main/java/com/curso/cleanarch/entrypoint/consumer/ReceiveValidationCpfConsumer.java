package com.curso.cleanarch.entrypoint.consumer;

import com.curso.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.curso.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.curso.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidationCpfConsumer {

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "curso")
    public void receive(CustomerMessage customerMessage){
        var customerEntity = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customerEntity, customerMessage.getZipCode());

    }
}
