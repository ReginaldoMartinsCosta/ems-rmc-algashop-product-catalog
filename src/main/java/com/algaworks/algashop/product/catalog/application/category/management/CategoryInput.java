package com.algaworks.algashop.product.catalog.application.category.management;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryInput {

    @NotBlank
    private String name;

    @NotNull
    private Boolean enabled;
}
