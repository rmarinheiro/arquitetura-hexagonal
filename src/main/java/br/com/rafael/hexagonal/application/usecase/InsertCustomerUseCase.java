package br.com.rafael.hexagonal.application.usecase;

import br.com.rafael.hexagonal.application.domain.Customer;
import br.com.rafael.hexagonal.application.ports.in.InsertCustomerInputPort;
import br.com.rafael.hexagonal.application.ports.out.FindAdrresByZipCodeOutputPort;
import br.com.rafael.hexagonal.application.ports.out.InsertOutPutPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {
    private final FindAdrresByZipCodeOutputPort findAdrresByZipCodeOutputPort;

    private  final InsertOutPutPort insertOutPutPort;

    public InsertCustomerUseCase(FindAdrresByZipCodeOutputPort findAdrresByZipCodeOutputPort,
                                InsertOutPutPort insertOutPutPort)
    {
        this.findAdrresByZipCodeOutputPort = findAdrresByZipCodeOutputPort;
        this.insertOutPutPort = insertOutPutPort;
    }
    public void insert(Customer customer, String zipCode) {
        var  address = findAdrresByZipCodeOutputPort.find(zipCode);
        customer.setAdress(address);
        insertOutPutPort.insert(customer);

    }

}
