package ru.netologu.orders_service.controller;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import ru.netologu.orders_service.entity.Order;

public record OrderFilter(String userId) {
    public Specification<Order> toSpecification() {
        return Specification.where(userIdSpec());
    }

    private Specification<Order> userIdSpec() {
        return ((root, query, cb) -> StringUtils.hasText(userId)
                ? cb.equal(cb.lower(root.get("userId")), userId.toLowerCase())
                : null);
    }
}