package br.com.rafael.hexagonal.adapters.out;

import br.com.rafael.hexagonal.adapters.out.repository.entity.repository.CustomerRepository;
import br.com.rafael.hexagonal.application.domain.Customer;
import br.com.rafael.hexagonal.application.ports.out.DeleteCustomerByIdOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutPutPort {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);

    }
}
