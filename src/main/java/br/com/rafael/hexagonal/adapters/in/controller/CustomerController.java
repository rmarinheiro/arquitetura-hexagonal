package br.com.rafael.hexagonal.adapters.in.controller;

import br.com.rafael.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import br.com.rafael.hexagonal.adapters.in.controller.request.CustomerRequest;
import br.com.rafael.hexagonal.adapters.in.controller.response.CustomerResponse;
import br.com.rafael.hexagonal.application.ports.in.FindCustomerIdByInputPort;
import br.com.rafael.hexagonal.application.ports.in.InsertCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FindCustomerIdByInputPort findCustomerIdByInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer,customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var customer = findCustomerIdByInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return  ResponseEntity.ok().body(customerResponse);
    }

}
