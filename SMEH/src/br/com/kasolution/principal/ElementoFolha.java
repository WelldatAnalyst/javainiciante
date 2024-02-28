package br.com.kasolution.principal;

public class ElementoFolha implements Componente {
    @Override
    public void operacao() {
        System.out.println("Executando operação em uma folha");
    }
}
