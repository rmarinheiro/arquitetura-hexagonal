package br.com.rafael.hexagonal.config;

import br.com.rafael.hexagonal.adapters.out.FindAddressZipCodeAdapter;
import br.com.rafael.hexagonal.adapters.out.InsertCustomerAdapter;
import br.com.rafael.hexagonal.application.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressZipCodeAdapter findAddressZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter
    ){
        return  new InsertCustomerUseCase(findAddressZipCodeAdapter,insertCustomerAdapter);
    }
}
