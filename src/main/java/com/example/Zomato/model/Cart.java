package com.example.Zomato.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Cart {

    Integer id;
    List<CartItem> cartItemList;
    Double cartAmount;
    OFFER OFFER;
}
