package br.com.kasolution.dominio;

public class Boletim {
    private String dataHoraImpressao;
    private Aluno[] alunos;

    public Boletim(String dataHoraImpressao, Aluno[] alunos) {
        this.dataHoraImpressao = dataHoraImpressao;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("Data e Hora de Impressão do Boletim: " + dataHoraImpressao);
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                aluno.imprime();
                System.out.println();
            }
        }
    }
}
