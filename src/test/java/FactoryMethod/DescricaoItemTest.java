package FactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DescricaoItemTest {

    @Test
    void deveDescreverItem() {
        IDescricao descricao = DescricaoFactory.obterDescricao("Item");
        assertEquals("Descrição de um Item", descricao.descreve());
    }

    @Test
    void deveCancelarDescricaoItem() {
        IDescricao descricao = DescricaoFactory.obterDescricao("Item");
        assertEquals("Descrição do Item cancelada", descricao.cancela());
    }

}
