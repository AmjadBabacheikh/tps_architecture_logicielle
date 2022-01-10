package com.example.decorateur.decorateurs;

import com.example.decorateur.Assurance;

public class InondationDecorateur extends DecorateurAbsrait {

    public InondationDecorateur(Assurance assurance) {
        super(assurance);
    }

    @Override
    public double frais() {
        return assurance.frais()+200;
    }
}
