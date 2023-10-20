package org.example.Controller;


import org.example.Entity.OrderEntity;
import org.example.Service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("/home")
    public String home(){return "Welcome to the order page";}

    @GetMapping("/{id}")
    public OrderEntity getOrder(@PathVariable String id){
        return orderService.orderById(Long.parseLong(id));
    }

    @GetMapping("/all")
    public List<OrderEntity> allOrders(){
        return orderService.allOrders();
    }

    @PostMapping("/add")
    public OrderEntity addOrder(@RequestBody OrderEntity order){
        return orderService.addOrder(order);
    }

    @PutMapping("/update")
    public OrderEntity updateOrder(@RequestBody OrderEntity order){
        return orderService.updateOrder(order);
    }

    @DeleteMapping("/delete/{id}")
    public OrderEntity deleteOrderById(@PathVariable String id){
        return orderService.deleteOrderById(Long.parseLong(id));
    }

    @DeleteMapping("/delete")
    public OrderEntity deleteOrder(@RequestBody OrderEntity order){
        return orderService.deleteOrder(order);
    }

}
