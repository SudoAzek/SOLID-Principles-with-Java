package com.mezonworks.solid.isp.order_isp_violation;

public interface OrderService {

    Order createOrder();

    Order changeOrder();

    boolean cancelOrder(int orderId);

    Order submitOrder(int orderId);

    Order getOrder(int orderId);

    boolean processOrder(int orderId);
}
