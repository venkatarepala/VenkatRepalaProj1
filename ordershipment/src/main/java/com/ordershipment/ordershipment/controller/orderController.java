package com.ordershipment.ordershipment.controller;

import com.ordershipment.ordershipment.orders.OrderDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderController {

    private OrderDetails orderDetails;

    @GetMapping("/getOrderDetails")
    public OrderDetails getOrderDetails() {
        return orderDetails;
    }
}
