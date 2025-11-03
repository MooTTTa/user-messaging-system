package com.curso.cleanarch.dataprovider.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    @Id
    private String id;
    private String name;
    private String cpf;
    private AddressEntity address;
    private Boolean isValidCpf;
}
