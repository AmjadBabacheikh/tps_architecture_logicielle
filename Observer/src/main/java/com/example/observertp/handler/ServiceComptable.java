package com.example.observertp.handler;

import com.example.observertp.observable.Demande;
import lombok.Data;

@Data
public class ServiceComptable extends Handler{

     public ServiceComptable(Demande demande){
         this.demande=demande;
     }


    @Override
    public void handle() {
        this.demande.verifie();
        this.nextHandler.handle();
    }
}
