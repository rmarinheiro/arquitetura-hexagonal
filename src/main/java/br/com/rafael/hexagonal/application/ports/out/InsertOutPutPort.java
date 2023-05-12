package br.com.rafael.hexagonal.application.ports.out;

import br.com.rafael.hexagonal.application.domain.Customer;

public interface InsertOutPutPort {

    void insert(Customer customer);
}
