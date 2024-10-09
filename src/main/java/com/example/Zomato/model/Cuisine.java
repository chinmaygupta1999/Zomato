package com.example.Zomato.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Cuisine {
    Integer id;
    String name;
    List<CuisineItem> items;
}
