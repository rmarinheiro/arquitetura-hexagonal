package br.com.rafael.hexagonal.application.usecase;

import br.com.rafael.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import br.com.rafael.hexagonal.application.ports.in.FindCustomerIdByInputPort;
import br.com.rafael.hexagonal.application.ports.out.DeleteCustomerByIdOutPutPort;

public class DeleteCustomByIdUseCase implements DeleteCustomerByIdInputPort {

    private  final FindCustomerIdByInputPort findCustomerIdByInputPort;

    private final DeleteCustomerByIdOutPutPort deleteCustomerByIdOutPutPort;

    public DeleteCustomByIdUseCase(FindCustomerIdByInputPort findCustomerIdByInputPort,
                                    DeleteCustomerByIdOutPutPort deleteCustomerByIdOutPutPort)
    {
        this.findCustomerIdByInputPort = findCustomerIdByInputPort;
        this.deleteCustomerByIdOutPutPort =deleteCustomerByIdOutPutPort;
    }

    @Override
    public  void delete(String id){
        findCustomerIdByInputPort.find(id);
        deleteCustomerByIdOutPutPort.delete(id);
    }
}
