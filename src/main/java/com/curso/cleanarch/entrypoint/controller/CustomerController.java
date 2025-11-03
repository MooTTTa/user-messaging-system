package com.curso.cleanarch.entrypoint.controller;

import com.curso.cleanarch.core.dataprovider.UpdateCustomer;
import com.curso.cleanarch.core.usecase.DeleteCustomerUseCase;
import com.curso.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.curso.cleanarch.core.usecase.InsertCustomerUseCase;
import com.curso.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.curso.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.curso.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.curso.cleanarch.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private DeleteCustomerUseCase deleteCustomerUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var customer = findCustomerByIdUseCase.find(id);
        return new ResponseEntity<>(customerMapper.toCustomer(customer), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id, @Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUseCase.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id){
       deleteCustomerUseCase.delete(id);
       return ResponseEntity.noContent().build();
    }
}
