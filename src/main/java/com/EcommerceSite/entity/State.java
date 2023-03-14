package com.EcommerceSite.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "state")
@Data // automatically generate the getter/setter
public class State {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id ;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

}
