package ru.netologu.orders_service.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netologu.orders_service.OrderDto;
import ru.netologu.orders_service.entity.Order;
import ru.netologu.orders_service.repository.OrderRepository;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderResource {

    private final OrderRepository orderRepository;

    private final ObjectMapper objectMapper;

    @GetMapping("/by-user/{userId}")
    public OrderDto getUserOrders(@PathVariable String userId) {
      return new OrderDto("12312", "$", 1234, List.of("dsfsdfsdf", "asdasd"));

//        return orderRepository.getUsersOrder(userId);
    }

}
