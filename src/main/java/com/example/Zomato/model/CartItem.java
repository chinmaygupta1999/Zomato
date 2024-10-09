package com.example.Zomato.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class CartItem {

    Integer id;
    CuisineItem item;
    Integer quantity;
}
