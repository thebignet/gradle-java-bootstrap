package com.detoeuf.test;

import lombok.Value;

@Value(staticConstructor = "of")
public class User {

    String name;

    public String bonjour() {
        return "bonjour " + name;
    }
}
