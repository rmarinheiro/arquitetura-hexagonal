package br.com.rafael.hexagonal.adapters.out.repository.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "customer")
public class CustomerEntity {
    @Id
    private String id;

    private String name;
    private AddressEntity address;

    private String cpf;

    private Boolean isValidCpf;

    public CustomerEntity() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getIsValidCpf() {

        return isValidCpf;
    }

    public void setIsValidCpf(Boolean isValidCpf) {

        this.isValidCpf = isValidCpf;
    }


    public CustomerEntity(String id, String name, AddressEntity address, String cpf, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
    }
}
