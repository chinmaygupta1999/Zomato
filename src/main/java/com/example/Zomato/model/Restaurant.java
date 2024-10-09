package com.example.Zomato.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
public class Restaurant {
    @Id
    Integer id;
    String name;
    String userName;
    Double rating;
    List<Cuisine> Menu;

}
