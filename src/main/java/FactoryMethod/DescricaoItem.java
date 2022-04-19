package FactoryMethod;

public class DescricaoItem implements IDescricao{

    public String descreve() {
        return ("Descrição de um Item");
    }

    public String cancela() {
        return ("Descrição do Item cancelada");
    }
}
