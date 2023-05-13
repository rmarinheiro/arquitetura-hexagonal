package br.com.rafael.hexagonal.adapters.in.controller.mapper;

import br.com.rafael.hexagonal.adapters.in.controller.request.CustomerRequest;
import br.com.rafael.hexagonal.adapters.in.controller.response.CustomerResponse;
import br.com.rafael.hexagonal.application.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address",ignore = true)
    @Mapping(target = "isValid",ignore = true)
    Customer toCustomer(CustomerRequest customRequest);

    CustomerResponse toCustomerResponse(Customer customer);

}
