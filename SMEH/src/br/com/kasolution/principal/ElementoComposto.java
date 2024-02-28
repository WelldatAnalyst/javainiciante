package br.com.kasolution.principal;

import java.util.ArrayList;
import java.util.List;


public class ElementoComposto implements Componente {
    private List<Componente> elementos = new ArrayList<>();

    public void adicionarElemento(Componente elemento) {
        elementos.add(elemento);
    }

    public void operacao() {
        System.out.println("Executando operação em um elemento composto");

        for (Componente elemento : elementos) {
            elemento.operacao();
        }
    }
}
