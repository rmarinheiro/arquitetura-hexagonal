package br.com.rafael.hexagonal.adapters.out.repository.entity.repository;

import br.com.rafael.hexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity,String> {
}
