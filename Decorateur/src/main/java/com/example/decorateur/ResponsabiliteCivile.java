package com.example.decorateur;

public class ResponsabiliteCivile extends Assurance {

    public ResponsabiliteCivile() {
        description = "ResponsabiliteCivile";
    }

    @Override
    public double frais() {
        return 1000.0;
    }
}
