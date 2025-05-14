package ru.netologu.orders_service;

import lombok.Value;
import ru.netologu.orders_service.entity.Order;

import java.util.List;

/**
 * DTO for {@link Order}
 */
@Value
public class OrderDto {
    String userId;
    String currency;
    Integer totalCost;
    List<String> listOfGoods;

    public static OrderDto fromEntity (Order order){
        return new OrderDto(
                order.getUserId(),
                order.getCurrency(),
                order.getTotalCost(),
                order.getListOfGoods());
    }
}