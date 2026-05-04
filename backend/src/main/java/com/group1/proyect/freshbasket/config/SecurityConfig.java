package com.group1.proyect.freshbasket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    //Encripta las contraseñas para que no pueda ser vista en texto plano en la BD.
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Autoriza TODAS las peticiones sin pedir login
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
            // Desactiva CSRF para poder usar CRUD tranquilamente
            .csrf(csrf -> csrf.disable()); 
        
        return http.build();
    }
}