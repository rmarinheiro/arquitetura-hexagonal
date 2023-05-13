package br.com.rafael.hexagonal.adapters.out;

import br.com.rafael.hexagonal.adapters.out.repository.entity.CustomerEntity;
import br.com.rafael.hexagonal.adapters.out.repository.entity.mapper.CustomerEntityMapper;
import br.com.rafael.hexagonal.adapters.out.repository.entity.repository.CustomerRepository;
import br.com.rafael.hexagonal.application.domain.Customer;
import br.com.rafael.hexagonal.application.ports.out.InsertOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertOutPutPort {
   @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public void insert(Customer customer) {
       var customerEntity= customerEntityMapper.toCustomerEntity(customer);
       customerRepository.save(customerEntity);
    }
}
