package com.curso.cleanarch.core.dataprovider;

import com.curso.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
