package com.zr7.compteservice.dtos;

import lombok.Data;

@Data
public class VirementRequestDTO {
    private Long codeSource;
    private Long codeDestination;
    private double montant;
}
