package br.com.rafael.hexagonal.application.usecase;

import br.com.rafael.hexagonal.application.domain.Customer;
import br.com.rafael.hexagonal.application.ports.in.FindCustomerIdByInputPort;
import br.com.rafael.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class FindCustomerByIdUseCase implements FindCustomerIdByInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }


    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id).orElseThrow(()->new RuntimeException("Customer not Found"));

    }
}
