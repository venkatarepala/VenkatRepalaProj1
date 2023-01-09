package com.ordershipment.ordershipment.controller;

import com.ordershipment.ordershipment.orders.OrderDetailService;
import com.ordershipment.ordershipment.orders.OrderDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderDetailService orderDetailService;

    @GetMapping("/getOrderDetails")
    public OrderDetails getOrderDetails() {
        logger.info("Get Order details -- Start");
        return this.orderDetailService.getOrderDetails();
    }
}
