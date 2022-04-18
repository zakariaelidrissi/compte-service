package com.zr7.compteservice.service;

public interface CompteService {
    void virement(Long codeSource, Long codeDestination, double montant);
}
