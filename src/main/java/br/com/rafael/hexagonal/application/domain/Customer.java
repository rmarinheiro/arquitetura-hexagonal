package br.com.rafael.hexagonal.application.domain;

public class Customer {

    private String id;

    private String name;

    private Address adress;

    private String cpf;

    private Boolean isValid;

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

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
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

    public Customer(String id, String name, Address adress, String cpf, Boolean isValid) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.cpf = cpf;
        this.isValid = isValid;
    }

    public Customer(){
        this.isValid = false;
    }
}
