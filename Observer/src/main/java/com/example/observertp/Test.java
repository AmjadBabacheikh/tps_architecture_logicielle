package com.example.observertp;

import com.example.observertp.handler.Handler;
import com.example.observertp.handler.ServiceComptable;
import com.example.observertp.handler.ServicePatrimoine;
import com.example.observertp.observable.Demande;
import com.example.observertp.observateur.Budget;
import com.example.observertp.observateur.Observateur;

public class Test {

    public static void main(String[] args) {
        Observateur budget = new Budget();
        Demande demande = new Demande(budget);
        demande.setMontant(1000.0);
        demande.setDepartementBudget(1900);
        System.out.println(demande.getDepartementBudget());
        Handler serviceComptable = new ServiceComptable(demande);
        Handler servicePatrimoine = new ServicePatrimoine(demande);
        serviceComptable.setNextHandler(servicePatrimoine);
        serviceComptable.handle();
        System.out.println(demande.getDepartementBudget());
    }
}
