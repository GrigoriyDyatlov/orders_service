package ru.netologu.orders_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import ru.netologu.orders_service.entity.Order;

import java.util.List;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID>, JpaSpecificationExecutor<Order> {
    @Query("select o from Order o where upper(o.userId) = upper(?1)")
    List<Order> getUsersOrder(String userId);

}