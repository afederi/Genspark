package org.example.Service;

import org.example.Entity.OrderEntity;
import org.example.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl  implements  OrderService{

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public OrderEntity addOrder(OrderEntity order) {
        return orderRepository.save(order);
    }
    @Override
    public List<OrderEntity> allOrders() {
        return orderRepository.findAll();
    }

    @Override
    public OrderEntity orderById(long orderId) {
        return orderRepository.findById(orderId).get();
    }

    @Override
    public OrderEntity updateOrder(OrderEntity order) {
        return orderRepository.save(order);
    }

    @Override
    public OrderEntity deleteOrder(OrderEntity order) {
        OrderEntity or = orderRepository.findById(order.getOrderId()).get();
        orderRepository.delete(or);
        return or;
    }

    @Override
    public OrderEntity deleteOrderById(long orderId) {
        OrderEntity or = orderRepository.findById(orderId).get();
        orderRepository.delete(or);
        return or;
    }
}
