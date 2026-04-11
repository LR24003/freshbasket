package com.group1.proyect.freshbasket.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_supplier")
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 15)
    private String phone;

    @Column(length = 100)
    private String email;

    // Relación 1:N: Un proveedor tiene muchos productos
    @OneToMany(mappedBy = "supplier", fetch = FetchType.LAZY)
    @JsonIgnore 
    private List<Product> products = new ArrayList<>();

    // Relación 1:N: Un proveedor tiene muchas entradas
    @OneToMany(mappedBy = "supplier", fetch = FetchType.LAZY)
    @JsonIgnore 
    private List<Entry> entries = new ArrayList<>();
}
