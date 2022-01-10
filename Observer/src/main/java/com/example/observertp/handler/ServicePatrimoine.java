package com.example.observertp.handler;


import com.example.observertp.observable.Demande;
import lombok.Data;

@Data
public class ServicePatrimoine extends Handler {

    public ServicePatrimoine(Demande demande){
        this.demande=demande;
    }

    @Override
    public void handle() {
        this.demande.soustrait();
    }
}
