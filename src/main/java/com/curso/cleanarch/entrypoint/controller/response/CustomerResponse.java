package com.curso.cleanarch.entrypoint.controller.response;

import lombok.Data;

@Data
public class CustomerResponse{
    String nome;
    String cpf;
    Boolean isValidCpf;
    AddressResponse addressResponse;
}
