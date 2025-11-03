package com.curso.cleanarch.dataprovider.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntity {
    private String street;
    private String city;
    private String state;
}
