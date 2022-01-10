package com.example.decorateur;

import com.example.decorateur.decorateurs.IncendieDecorateur;
import com.example.decorateur.decorateurs.VolDecorateur;

public class Test {
    public static void main(String[] args) {
        Assurance assurance1 = new ResponsabiliteCivile();
        System.out.println(assurance1.frais());
        assurance1=new IncendieDecorateur(assurance1);
        System.out.println(assurance1.frais());
        assurance1=new VolDecorateur(assurance1);
        System.out.println(assurance1.frais());
    }

}
