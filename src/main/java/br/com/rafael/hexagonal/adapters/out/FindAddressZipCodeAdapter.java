package br.com.rafael.hexagonal.adapters.out;

import br.com.rafael.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import br.com.rafael.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import br.com.rafael.hexagonal.adapters.out.client.response.AddressResponse;
import br.com.rafael.hexagonal.application.domain.Address;
import br.com.rafael.hexagonal.application.ports.out.FindAdrresByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressZipCodeAdapter implements FindAdrresByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
         var  addressResponse  = findAddressCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
