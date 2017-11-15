package com.detoeuf.test;

import lombok.Data;

@Data
public class Chou {
    private String toto;

    public String name() {
        return "romanesco";
    }

    public String bonjour(String nom){
        return "romanesco "+nom;
    }
}
