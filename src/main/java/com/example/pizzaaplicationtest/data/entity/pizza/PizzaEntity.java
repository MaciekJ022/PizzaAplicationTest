package com.example.pizzaaplicationtest.data.entity.pizza;

import com.example.pizzaaplicationtest.data.entity.size.SizeEntity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "pizzas")
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "pizzas", orphanRemoval = true)
    private ;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

}
