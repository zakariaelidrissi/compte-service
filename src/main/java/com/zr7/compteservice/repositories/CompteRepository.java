package com.zr7.compteservice.repositories;

import com.zr7.compteservice.entities.Compte;
import com.zr7.compteservice.enums.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/*
 * On suprimer l'annotation @RestController dans la classe CompteRestController
 * Et on ajoute dans cette interface l'annotation @RepositoryRestResource
 * pour créer un micro-service et pour accéder à la base de données
 */

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long> {
    @RestResource(path = "/byType")
    List<Compte> fingByType(@Param(value= "type") TypeCompte typeCompte);
}
