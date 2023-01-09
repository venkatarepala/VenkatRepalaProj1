package com.ordershipment.ordershipment.orders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{

    Logger logger = LoggerFactory.getLogger(OrderDetailServiceImpl.class);
    OrderDetails orderDetails;

    /**
     * @return
     */
    @Override
    public OrderDetails getOrderDetails() {
        logger.info("getOrderDetails -- start");
        Order order = new Order();
        Shipment shipment = new Shipment();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable orderTask = () -> {
            System.out.println("Order Execution : " + Thread.currentThread().getName());
            order.setOrderId("SatishOrder1");
            order.setProductId("SatishProduct1");
            order.setQty(new Double(23));
            logger.info("OrderDetailServiceImpl -- Order done");
        };

        Runnable shipmentTask = () -> {
            System.out.println("Shipment Execution : " + Thread.currentThread().getName());
            shipment.setOrderId("SatishOrder1");
            shipment.setShipmentId("SatishShipment1");
            shipment.setProductId("SatishProduct1");
            // shipment.setShipmentDate(LocalDate.parse((CharSequence) new Date ("2021-02-19")));
            shipment.setQty(new Double(23));
            logger.info("OrderDetailServiceImpl -- shipment done");

        };
        executorService.submit(orderTask);
        executorService.submit(shipmentTask);

        executorService.shutdown();
        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setOrder(order);
        orderDetails.setShipment(shipment);
        logger.info("OrderDetailServiceImpl -- order-details done");

        return orderDetails;
    }

    public OrderDetailServiceImpl(){
        logger.info("OrderDetailServiceImpl -- start");
        logger.info("OrderDetailServiceImpl -- OrderDetails");
    }

}
