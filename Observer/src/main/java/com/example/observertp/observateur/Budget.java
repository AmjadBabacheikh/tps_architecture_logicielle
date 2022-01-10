package com.example.observertp.observateur;

import com.example.observertp.observable.Demande;
import com.example.observertp.observable.Observable;

public class Budget implements Observateur {
    @Override
    public void verifie(Observable observable) {
        Demande d = (Demande) observable;
        if (!(d.getMontant() <= d.getDepartementBudget())) {
            throw new RuntimeException("le montant de la demande est superieur au budget departement");
        }
    }

    @Override
    public void soustrait(Observable observable) {
        Demande d = (Demande) observable;
        d.setDepartementBudget(d.getDepartementBudget() - d.getMontant());
    }
}
