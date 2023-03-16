package com.EcommerceSite.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Data // automatically generate the getter/setter
public class Address {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id ;

    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Order order;

}
