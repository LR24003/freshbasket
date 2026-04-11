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
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = false)
    private String password; // En un futuro real esto se encripta

    @Column(length = 20)
    private String role;

    // Relación 1:N: Un usuario hace muchas entradas
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonIgnore 
    private List<Entry> entries = new ArrayList<>();

    // Relación 1:N: Un usuario hace muchas salidas
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonIgnore 
    private List<Exit> exits = new ArrayList<>();
}