package com.example.observertp.observable;

import com.example.observertp.observateur.Observateur;


public abstract class Observable {
    Observateur observateur;

    public void verifie() {
        observateur.verifie(this);
    }

    public void soustrait() {
        observateur.soustrait(this);
    }

}
