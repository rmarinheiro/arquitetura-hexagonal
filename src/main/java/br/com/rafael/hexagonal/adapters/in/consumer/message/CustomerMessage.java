package br.com.rafael.hexagonal.adapters.in.consumer.message;


public class CustomerMessage {

    private String id;

    private String name;

    private  String zipCode;

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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    public CustomerMessage(String id, String name, String zipCode, String cpf, Boolean isValid) {
        this.id = id;
        this.name = name;
        this.zipCode = zipCode;
        this.cpf = cpf;
        this.isValid = isValid;
    }
}
