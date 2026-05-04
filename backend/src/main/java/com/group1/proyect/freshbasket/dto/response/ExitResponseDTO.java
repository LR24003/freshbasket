package com.group1.proyect.freshbasket.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExitResponseDTO {

    private Long id;
    private Integer quantity;
    private LocalDateTime exitDate;

    private Long productId;
    private Long userId;
}