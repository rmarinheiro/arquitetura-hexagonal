package br.com.rafael.hexagonal.config;

import br.com.rafael.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import br.com.rafael.hexagonal.application.usecase.DeleteCustomByIdUseCase;
import br.com.rafael.hexagonal.application.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerById {

    @Bean
    public DeleteCustomByIdUseCase deleteCustomerById(
           FindCustomerByIdUseCase findCustomerByIdUseCase,
           DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return  new DeleteCustomByIdUseCase(findCustomerByIdUseCase,deleteCustomerByIdAdapter);
    }
}
