package com.detoeuf.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChouTest {

    @Test
    void nameShouldReturnRomanesco() {
        assertThat(new Chou().name()).isEqualTo("romanesco");
    }

    @ParameterizedTest
    @ValueSource(strings = { "Jean", "Pierre", "Claude" })
    void bonjourShouldEndWithName(String name) {
        assertThat(new Chou().bonjour(name)).endsWith(name);
    }

    @Test
    void toto(){
        Chou chou = new Chou();
        chou.
    }


}
