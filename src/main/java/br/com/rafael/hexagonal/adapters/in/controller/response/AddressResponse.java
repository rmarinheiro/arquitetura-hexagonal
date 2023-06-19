package br.com.rafael.hexagonal.adapters.in.controller.response;

public class AddressResponse {

    private String street;

    private String state;

    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AddressResponse(String street, String state, String city) {
        this.street = street;
        this.state = state;
        this.city = city;
    }
}
