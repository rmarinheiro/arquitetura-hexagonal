package br.com.rafael.hexagonal.application.ports.out;

import br.com.rafael.hexagonal.application.domain.Address;

public interface FindAdrresByZipCodeOutputPort {
    Address find(String zipCode);
}
