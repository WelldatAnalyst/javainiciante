import java.util.ArrayList;
import java.util.List;

public class VerificarStatus {
    private String nome;
    private List<Double> notas;

    public VerificarStatus(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public String getStatus() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }


    public static void main(String[] args) {
    	VerificarStatus verificarStatus = new VerificarStatus("João");

    	verificarStatus.adicionarNota(0.0);
    	verificarStatus.adicionarNota(7.0);
    	verificarStatus.adicionarNota(6.5);

        System.out.println("Média: " + verificarStatus.calcularMedia());
        System.out.println("Status: " + verificarStatus.getStatus());
    }
}