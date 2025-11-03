package com.curso.cleanarch.entrypoint.controller.request;

import com.curso.cleanarch.core.domain.Address;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerRequest {
    @NotBlank
    String name;
    @NotBlank
    String cpf;
    @NotBlank
    String zipCode;
}
