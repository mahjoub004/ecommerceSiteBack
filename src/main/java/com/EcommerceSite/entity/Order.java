package com.EcommerceSite.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor // automatically generate the getter/setter
public class Order {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String orderTrackingNumber;
    private int totalQuantity;
    private BigDecimal totalPrice;
    private String status;

    @CreationTimestamp
    private Date dateCreated;
    @CreationTimestamp
    private Date dateUpdated;

    @OneToMany(mappedBy = "order" ,cascade = CascadeType.ALL)
    private Set<OrderItem> orderItemList = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shipping_address_id",referencedColumnName = "id")
    private Address shippingAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billing_address_id",referencedColumnName = "id")
    private Address billingAddress;





    public void add (OrderItem item){
        if (item != null) {
            if (orderItemList == null) {
                orderItemList = new HashSet<>();
            }
            orderItemList.add(item);
            item.setOrder(this);
        }
    }



}
