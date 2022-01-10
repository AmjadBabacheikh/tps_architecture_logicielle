package com.example.decorateur.decorateurs;

import com.example.decorateur.Assurance;

public class IncendieDecorateur extends DecorateurAbsrait {

    public IncendieDecorateur(Assurance assurance) {
        super(assurance);
    }

    @Override
    public double frais() {
        return assurance.frais()+500;
    }
}
