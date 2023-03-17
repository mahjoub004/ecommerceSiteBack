package com.EcommerceSite.service;

import com.EcommerceSite.dto.Purchase;
import com.EcommerceSite.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
