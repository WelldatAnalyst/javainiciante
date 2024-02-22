package br.com.kasolution.principal;

public class MamiferoMarinho extends AnimalMarinho {
    private String tipoBarbatana;

    public MamiferoMarinho(String nome, int idade, String habitat, String tipoBarbatana) {
        super(nome, idade, habitat);
        this.tipoBarbatana = tipoBarbatana;
    }


    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Barbatana: " + tipoBarbatana);
    }
}