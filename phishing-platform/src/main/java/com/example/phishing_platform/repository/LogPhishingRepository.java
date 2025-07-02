package com.example.phishing_platform.repository;


import com.example.phishing_platform.model.LogPhishing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogPhishingRepository extends JpaRepository<LogPhishing, Long> {}
