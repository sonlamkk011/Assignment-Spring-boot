package com.example.assignmentspringboot.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class OrderDetailId {
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "food_id")
    private String foodId;
}
