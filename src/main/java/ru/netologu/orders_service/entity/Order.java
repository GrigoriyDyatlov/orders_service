package ru.netologu.orders_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "order_")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "currency")
    private String currency;

    @Column(name = "total_cost")
    private Integer totalCost;

    @Column(name = "list_of_goods")
    private List<String> listOfGoods;

}