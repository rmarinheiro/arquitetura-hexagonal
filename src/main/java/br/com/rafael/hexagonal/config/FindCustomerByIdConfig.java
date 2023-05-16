package br.com.rafael.hexagonal.config;

import br.com.rafael.hexagonal.adapters.out.FindAddressZipCodeAdapter;
import br.com.rafael.hexagonal.adapters.out.FindCustomerIdAdapter;
import br.com.rafael.hexagonal.adapters.out.InsertCustomerAdapter;
import br.com.rafael.hexagonal.application.usecase.FindCustomerByIdUseCase;
import br.com.rafael.hexagonal.application.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerIdAdapter findCustomerIdAdapter
    ){
        return  new FindCustomerByIdUseCase(findCustomerIdAdapter);
    }
}
