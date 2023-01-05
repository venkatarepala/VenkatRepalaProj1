package com.ordershipment.ordershipment.orders;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Shipment {
    private String orderId;
    private String shipmentId;
    private String productId;
    private LocalDate shipmentDate;
    private Double qty;
}
