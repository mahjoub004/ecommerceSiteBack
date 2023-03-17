package com.EcommerceSite.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
@Data // automatically generate the getter/setter
public class Customer {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id ;
    private String firstName;
    private String lastName;
    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Order> ordersList;


    public void add (Order order){
        if (order != null) {
            if (ordersList == null) {
                ordersList = new HashSet<>();
            }
            ordersList.add(order);
            order.setCustomer(this);
        }
    }


}
