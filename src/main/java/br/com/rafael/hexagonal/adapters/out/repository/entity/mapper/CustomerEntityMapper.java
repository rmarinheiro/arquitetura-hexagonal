package br.com.rafael.hexagonal.adapters.out.repository.entity.mapper;

import br.com.rafael.hexagonal.adapters.out.repository.entity.CustomerEntity;
import br.com.rafael.hexagonal.application.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
