package br.com.rafael.hexagonal.application.ports.out;

public interface SendCpfForValidationOutPutPort {

    void send(String cpf);
}
