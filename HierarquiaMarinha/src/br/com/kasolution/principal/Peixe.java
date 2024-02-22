package br.com.kasolution.principal;

public class Peixe extends AnimalMarinho {
    private String tipoEscama;

        public Peixe(String nome, int idade, String habitat, String tipoEscama) {
        super(nome, idade, habitat);
        this.tipoEscama = tipoEscama;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Escama: " + tipoEscama);
    }
}

