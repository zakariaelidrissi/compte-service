package com.zr7.compteservice.entities;

import com.zr7.compteservice.enums.TypeCompte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/*
 * @Data : permet d'ajouter les getters et les setters
 * @NoArgsConstructor : permet d'ajouter un constructeur sans arguments
 * @AllArgsConstructor : permet d'ajouter un constructeur avec des arguments
 * @Entity : permet d'utiliser l'entité jpa
 *
 */

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Compte {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private double solde;
    private Date dateCreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte type;
    /*
     * EnumType.ORDINAL : pour enregistré le type de compte dans la base de donées comme un entier.
     * soit 0 : COURANT
     * soit 1 : EPARGNE
     * EnumType.STRING : pour enregistré le type de compte dans la base de donées comme un chaine de caractère.
     * soit COURANT
     * soit EPARGNE
     */
}
