package FactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DescricaoFactoryTest {

    @Test
    void deveRetornarExcecaoParaDescricaoInexistente() {
        try {
            IDescricao descricao = DescricaoFactory.obterDescricao("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Descrição Inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaDescricaoInvalida() {
        try {
            IDescricao descricao = DescricaoFactory.obterDescricao("Test");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Descrição Inválida", e.getMessage());
        }
    }
}
