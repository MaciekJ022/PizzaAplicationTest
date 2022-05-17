package com.example.pizzaaplicationtest.remote.rest.dto.request;

public class PizzaOrderDto {

    private Integer Sizeid;
    private Integer count;

    public PizzaOrderDto(Integer id, Integer count) {
        Sizeid = id;
        this.count = count;
    }

    public Integer getId() {
        return Sizeid;
    }

    public void setId(Integer id) {
        Sizeid = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
