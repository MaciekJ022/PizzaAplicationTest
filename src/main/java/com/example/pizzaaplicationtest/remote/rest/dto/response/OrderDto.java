package com.example.pizzaaplicationtest.remote.rest.dto.response;

import com.example.pizzaaplicationtest.domain.model.OrderStatusType;
import com.example.pizzaaplicationtest.remote.rest.dto.request.PersonOrderDto;
import com.example.pizzaaplicationtest.remote.rest.dto.request.PizzaOrderDto;

import java.util.List;

public class OrderDto {

    private Integer id;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public OrderDto(Integer id, OrderStatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto persons) {
        id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = persons;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { id = id; }

    public OrderStatusType getStatus() { return status; }

    public void setStatus(OrderStatusType status) { this.status = status; }

    public List<PizzaOrderDto> getPizzas() { return pizzas; }

    public void setPizzas(List<PizzaOrderDto> pizzas) { this.pizzas = pizzas; }

    public PersonOrderDto getPersons() { return person; }

    public void setPersons(PersonOrderDto persons) { this.person = persons; }
}
