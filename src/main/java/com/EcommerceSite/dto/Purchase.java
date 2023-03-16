package com.EcommerceSite.dto;

import com.EcommerceSite.entity.Address;
import com.EcommerceSite.entity.Customer;
import com.EcommerceSite.entity.Order;
import com.EcommerceSite.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
