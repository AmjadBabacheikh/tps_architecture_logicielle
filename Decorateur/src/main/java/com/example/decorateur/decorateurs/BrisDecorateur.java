package com.example.decorateur.decorateurs;

import com.example.decorateur.Assurance;

public class BrisDecorateur extends DecorateurAbsrait {

    public BrisDecorateur(Assurance assurance) {
        super(assurance);
    }

    @Override
    public double frais() {
        return assurance.frais()+400;
    }
}
