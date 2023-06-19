package br.com.rafael.hexagonal.adapters.out;

import br.com.rafael.hexagonal.adapters.out.repository.entity.mapper.CustomerEntityMapper;
import br.com.rafael.hexagonal.adapters.out.repository.entity.repository.CustomerRepository;
import br.com.rafael.hexagonal.application.domain.Customer;
import br.com.rafael.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class FindCustomerIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return  customerEntity.map(entity->customerEntityMapper.toCustomer(entity));
    }
}
