package br.com.rafael.hexagonal.adapters.out.client.mapper;

import br.com.rafael.hexagonal.adapters.out.client.response.AddressResponse;
import br.com.rafael.hexagonal.application.domain.Address;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface AddressResponseMapper  {

    Address toAddress(AddressResponse addressResponse);
}
