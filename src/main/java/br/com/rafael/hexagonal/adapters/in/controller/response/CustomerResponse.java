package br.com.rafael.hexagonal.adapters.in.controller.response;

import br.com.rafael.hexagonal.application.domain.Address;

public class CustomerResponse {

    private String name;

    private AddressResponse adress;

    private String cpf;

    private Boolean isValid;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressResponse getAdress() {
        return adress;
    }

    public void setAdress(AddressResponse adress) {
        this.adress = adress;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }

    public CustomerResponse(String name, AddressResponse adress, String cpf, Boolean isValid) {
        this.name = name;
        this.adress = adress;
        this.cpf = cpf;
        this.isValid = isValid;
    }
}

