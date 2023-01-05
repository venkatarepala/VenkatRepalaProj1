package com.ordershipment.ordershipment.orders;

import lombok.Data;

@Data
public class Order {
    private String orderId;
    private String productId;
    private Double qty;

}
