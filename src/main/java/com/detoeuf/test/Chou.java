package com.detoeuf.test;

import lombok.Value;

@Value(staticConstructor = "of")
public class Chou {

    String toto;

    public String name() {
        return "romanesco";
    }

    public String bonjour(String nom){
        return "romanesco "+nom;
    }
}
