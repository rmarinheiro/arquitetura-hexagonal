package br.com.rafael.hexagonal.application.ports.in;

import br.com.rafael.hexagonal.application.domain.Customer;

public interface FindCustomerIdByInputPort {
    Customer find(String id);
}
