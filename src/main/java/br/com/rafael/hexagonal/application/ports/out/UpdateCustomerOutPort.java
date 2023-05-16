package br.com.rafael.hexagonal.application.ports.out;

import br.com.rafael.hexagonal.application.domain.Customer;

public interface UpdateCustomerOutPort {
    void update (Customer customer);
}
