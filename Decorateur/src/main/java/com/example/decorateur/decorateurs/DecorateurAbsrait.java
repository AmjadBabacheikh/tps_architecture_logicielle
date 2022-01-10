package com.example.decorateur.decorateurs;

import com.example.decorateur.Assurance;

public abstract  class DecorateurAbsrait extends Assurance {
    protected Assurance assurance;
    public DecorateurAbsrait(Assurance assurance){
        this.assurance=assurance;
    }
}
