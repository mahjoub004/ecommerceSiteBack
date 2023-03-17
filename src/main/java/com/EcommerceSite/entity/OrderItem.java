package com.EcommerceSite.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor// automatically generate the getter/setter
public class OrderItem {


    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id ;

    private String imageUrl;
    private BigDecimal unitPrice;
    private int quantity;
    private Long productId;


    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
