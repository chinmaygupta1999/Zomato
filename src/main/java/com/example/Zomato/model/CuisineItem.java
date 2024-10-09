package com.example.Zomato.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class CuisineItem {

    Integer id;
    String name;
    Double Price;
    Double rating;
    Integer noOfRatings;
    Boolean isAvailable;
    OFFER offer;
}
