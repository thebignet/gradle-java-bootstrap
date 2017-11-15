package com.detoeuf.test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ChouTest {

    @Test
    void nameShouldReturnRomanesco() {
        assertThat(Chou.of("jean").name()).isEqualTo("romanesco");
    }

    @ParameterizedTest
    @ValueSource(strings = { "Jean", "Pierre", "Claude" })
    void bonjourShouldEndWithName(String name) {
        assertThat(Chou.of("toto").bonjour(name)).endsWith(name);
    }

    @Test
    void toto(){
        assertThat(Chou.of("jean").getToto()).isEqualTo("jean");
    }


}
