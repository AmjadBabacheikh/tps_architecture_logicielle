package com.example.decorateur.decorateurs;

import com.example.decorateur.Assurance;

public class VolDecorateur extends DecorateurAbsrait {

    public VolDecorateur(Assurance assurance) {
        super(assurance);
    }

    @Override
    public double frais() {
        return assurance.frais() + 300.0;
    }
}
