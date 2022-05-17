package com.example.pizzaaplicationtest.remote.rest.dto.request;

public class PersonOrderDto {
    private String name;
    private String phone;
    private String address;
    private Integer floor;

    public PersonOrderDto(String name, String phoneNumber, String address, Integer floor) {
        this.name = name;
        this.phone = phoneNumber;
        this.address = address;
        this.floor = floor;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phone; }

    public void setPhoneNumber(String phoneNumber) { this.phone = phoneNumber; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public Integer getFloor() { return floor; }

    public void setFloor(Integer floor) { this.floor = floor; }
}
