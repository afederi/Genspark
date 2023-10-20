package org.example.Service;

import org.example.Entity.OrderEntity;

import java.util.List;

public interface OrderService
{

    public OrderEntity addOrder(OrderEntity order);

    public List<OrderEntity> allOrders();

    public OrderEntity orderById(long orderId);

    public OrderEntity updateOrder(OrderEntity order);

    public OrderEntity deleteOrder(OrderEntity order);

    public OrderEntity deleteOrderById(long orderId);
}
