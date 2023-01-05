package com.ordershipment.ordershipment.orders;

import lombok.Data;

@Data
public class OrderDetails {
    private Order order;
    private Shipment shipment;

}
