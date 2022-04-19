package FactoryMethod;

public class DescricaoFactory {

    public static IDescricao obterDescricao(String descricao) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("FactoryMethod.Descricao" + descricao);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Descrição Inexistente");
        }
        if (!(objeto instanceof IDescricao)) {
            throw new IllegalArgumentException("Descrição Inválida");
        }
        return (IDescricao) objeto;
    }
}
