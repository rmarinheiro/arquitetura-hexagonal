package br.com.rafael.hexagonal.adapters.in.controller.request;

import javax.validation.constraints.NotBlank;

public class CustomerRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String cpf;

    @NotBlank
    private String zipCode;

    @NotBlank
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }



}