package com.example.Zomato.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Order {
    Integer id;
    Cart cart;
    User user;
    PAYMENTSTATUS PAYMENTSTATUS;
    Invoice invoice;
}
