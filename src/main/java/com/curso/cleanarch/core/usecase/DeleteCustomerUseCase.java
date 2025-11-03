package com.curso.cleanarch.core.usecase;

import com.curso.cleanarch.core.domain.Customer;
import org.apache.kafka.common.protocol.types.Field;

public interface DeleteCustomerUseCase {
    void delete(String id);
}
