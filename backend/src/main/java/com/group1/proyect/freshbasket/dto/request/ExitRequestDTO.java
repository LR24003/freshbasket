package com.group1.proyect.freshbasket.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExitRequestDTO {

    @Min(value = 1, message = "La cantidad debe ser mayor a 0")
    private Integer quantity;

    @NotNull(message = "El producto es obligatorio")
    private Long productId;

    @NotNull(message = "El usuario es obligatorio")
    private Long userId;
} 
