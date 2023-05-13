package br.com.rafael.hexagonal.application.ports.out;

import br.com.rafael.hexagonal.application.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
