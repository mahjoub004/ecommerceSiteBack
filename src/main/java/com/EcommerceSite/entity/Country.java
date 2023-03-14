package com.EcommerceSite.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
@Data // automatically generate the getter/setter
public class Country {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    private String name;

    private String code ;

    @OneToMany(mappedBy = "country")
    @JsonIgnore // will ignore the states
    private List<State> states;
}
