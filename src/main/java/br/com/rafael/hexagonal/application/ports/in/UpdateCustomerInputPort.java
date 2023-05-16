package br.com.rafael.hexagonal.application.ports.in;

import br.com.rafael.hexagonal.application.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer,String zipCode);
}
