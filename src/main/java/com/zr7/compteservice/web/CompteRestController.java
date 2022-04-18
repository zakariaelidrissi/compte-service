package com.zr7.compteservice.web;

import com.zr7.compteservice.entities.Compte;
import com.zr7.compteservice.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * On suprimer l'annotation @RestController dans ce classe
 * Et on ajoute dans cette interface CompteRepository l'annotation @RepositoryRestResource
 * pour créer un micro-service et pour accéder à la base de données
 */

//@RestController
public class CompteRestController {

    private CompteRepository compteRepository;

    public CompteRestController(CompteRepository compteRepository){

        this.compteRepository = compteRepository;
    }

    @GetMapping(path = "/comptes")
    public List<Compte> listComptes() {
        return compteRepository.findAll();
    }

    @PostMapping(path = "/comptes")
    public Compte save(@RequestBody Compte compte) {
        return compteRepository.save(compte);
    }

    @PutMapping(path = "/comptes/{code}")
    public Compte update(@PathVariable Long code, @RequestBody Compte compte) {
        compte.setCode(code);
        return compteRepository.save(compte);
    }

    @DeleteMapping(path = "/comptes/{code}")
    public void delete(@PathVariable Long code) {
        compteRepository.deleteById(code);
    }
}
