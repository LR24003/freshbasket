package com.group1.proyect.freshbasket.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exits")
public class Exit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_exit")
    private Long id;

    @Column(nullable = false)
    private Integer quantity;

    @Column(name = "exit_date", nullable = false, updatable = false)
    private LocalDateTime exitDate;

    // Relación N:1 con Producto
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    // Relación N:1 con Usuario
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @PrePersist
    protected void onCreate() {
        exitDate = LocalDateTime.now();
    }
}