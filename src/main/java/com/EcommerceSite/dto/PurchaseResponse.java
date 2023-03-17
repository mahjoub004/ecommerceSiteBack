package com.EcommerceSite.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NonNull;


@Data
public class PurchaseResponse {
    @NonNull
    private final String OrderTrackingNumber;

}
