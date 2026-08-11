package com.algaworks.algashop.product.catalog.application.category.query;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDetailOutput {
    private UUID id;
    private String name;
    private Boolean enabled;
}
