package com.ordershipment.ordershipment.orders;

public class OrderDetailServiceImpl implements OrderDetailService{

    OrderDetails orderDetails;

    /**
     * @return
     */
    @Override
    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public OrderDetailServiceImpl(){

        Order order = new Order();
        order.setOrderId("SatishOrder1");
        order.setProductId("SatishProduct1");
        order.setQty(new Double(23));

        Shipment shipment = new Shipment();
        shipment.setOrderId("SatishOrder1");
        shipment.setShipmentId("SatishShipment1");
        shipment.setProductId("SatishProduct1");
        // shipment.setShipmentDate(new Date(2021 - 02 - 1));
        shipment.setQty(new Double(23));

        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setOrder(order);
        orderDetails.setShipment(shipment);

    }

}
