package br.com.rafael.hexagonal.application.usecase;

import br.com.rafael.hexagonal.application.domain.Customer;
import br.com.rafael.hexagonal.application.ports.in.InsertCustomerInputPort;
import br.com.rafael.hexagonal.application.ports.out.FindAdrresByZipCodeOutputPort;
import br.com.rafael.hexagonal.application.ports.out.InsertOutPutPort;
import br.com.rafael.hexagonal.application.ports.out.SendCpfForValidationOutPutPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {
    private final FindAdrresByZipCodeOutputPort findAdrresByZipCodeOutputPort;

    private  final InsertOutPutPort insertOutPutPort;

    private final SendCpfForValidationOutPutPort sendCpfForValidationOutPutPort;

    public InsertCustomerUseCase(FindAdrresByZipCodeOutputPort findAdrresByZipCodeOutputPort,
                                InsertOutPutPort insertOutPutPort, SendCpfForValidationOutPutPort sendCpfForValidationOutPutPort)
    {
        this.findAdrresByZipCodeOutputPort = findAdrresByZipCodeOutputPort;
        this.insertOutPutPort = insertOutPutPort;
        this.sendCpfForValidationOutPutPort = sendCpfForValidationOutPutPort;
    }
    public void insert(Customer customer, String zipCode) {
        var address = findAdrresByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertOutPutPort.insert(customer);
        sendCpfForValidationOutPutPort.send(customer.getCpf());

    }

}
