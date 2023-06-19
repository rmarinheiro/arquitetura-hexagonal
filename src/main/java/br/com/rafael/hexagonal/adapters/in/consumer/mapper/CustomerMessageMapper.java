package br.com.rafael.hexagonal.adapters.in.consumer.mapper;

import br.com.rafael.hexagonal.adapters.in.consumer.message.CustomerMessage;
import br.com.rafael.hexagonal.application.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address",ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
