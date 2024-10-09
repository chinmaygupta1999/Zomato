package com.example.Zomato.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Invoice {

    Integer id;
    Double Amount;
}
