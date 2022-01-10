package com.example.observertp.observateur;

import com.example.observertp.observable.Observable;

public interface Observateur {
   void  verifie(Observable observable);
    void soustrait(Observable observable);
}
