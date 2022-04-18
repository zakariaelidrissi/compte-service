package com.zr7.compteservice.service;

import com.zr7.compteservice.entities.Compte;
import com.zr7.compteservice.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CompteServiceImpl implements CompteService {
    @Autowired
    private CompteRepository compteRepository;
    @Override
    public void virement(Long codeSource, Long codeDestination, double montant) {
        Compte c1 = compteRepository.getById(codeSource);
        Compte c2 = compteRepository.getById(codeDestination);
        c1.setSolde(c1.getSolde()-montant);
        c2.setSolde(c2.getSolde()+montant);
        compteRepository.save(c1);
        compteRepository.save(c2);
    }
}
