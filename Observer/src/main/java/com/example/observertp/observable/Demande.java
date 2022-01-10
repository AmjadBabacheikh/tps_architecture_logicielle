package com.example.observertp.observable;

import com.example.observertp.observateur.Observateur;
import lombok.Data;

@Data
public class Demande extends Observable {
    private double montant;
    private double departementBudget;

    public Demande(Observateur observateur) {
        this.observateur = observateur;
    }

}
