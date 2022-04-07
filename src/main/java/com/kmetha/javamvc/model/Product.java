package com.kmetha.javamvc.model;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Integer id;
    private String title;
    private int cost;
}
