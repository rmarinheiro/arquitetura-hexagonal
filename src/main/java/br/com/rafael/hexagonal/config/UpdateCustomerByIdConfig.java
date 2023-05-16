package br.com.rafael.hexagonal.config;

import br.com.rafael.hexagonal.adapters.out.FindAddressZipCodeAdapter;
import br.com.rafael.hexagonal.adapters.out.UpdateCustomerAdapter;
import br.com.rafael.hexagonal.application.usecase.FindCustomerByIdUseCase;
import br.com.rafael.hexagonal.application.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerByIdConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressZipCodeAdapter findAddressZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressZipCodeAdapter, updateCustomerAdapter);
      }
}
