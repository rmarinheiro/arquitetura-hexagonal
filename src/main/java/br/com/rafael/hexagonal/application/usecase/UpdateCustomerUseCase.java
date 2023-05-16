package br.com.rafael.hexagonal.application.usecase;

import br.com.rafael.hexagonal.application.domain.Customer;
import br.com.rafael.hexagonal.application.ports.in.FindCustomerIdByInputPort;
import br.com.rafael.hexagonal.application.ports.in.UpdateCustomerInputPort;
import br.com.rafael.hexagonal.application.ports.out.FindAdrresByZipCodeOutputPort;
import br.com.rafael.hexagonal.application.ports.out.UpdateCustomerOutPort;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerIdByInputPort  findCustomerIdByInputPort;

    private final FindAdrresByZipCodeOutputPort findAdrresByZipCodeOutputPort;

    private UpdateCustomerOutPort updateCustomerOutPort;


    public UpdateCustomerUseCase(FindCustomerIdByInputPort findCustomerIdByInputPort,
                                FindAdrresByZipCodeOutputPort findAdrresByZipCodeOutputPort,
                                 UpdateCustomerOutPort updateCustomerOutPort){
        this.findCustomerIdByInputPort =findCustomerIdByInputPort;
        this.findAdrresByZipCodeOutputPort = findAdrresByZipCodeOutputPort;
        this.updateCustomerOutPort = updateCustomerOutPort;
    }
    @Override
    public void update(Customer customer,String cep){
        findCustomerIdByInputPort.find(customer.getId());
        var address= findAdrresByZipCodeOutputPort.find(cep);
        customer.setAdress(address);
        updateCustomerOutPort.update(customer);
    }
}
