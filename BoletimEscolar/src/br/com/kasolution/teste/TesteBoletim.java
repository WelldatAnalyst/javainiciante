package br.com.kasolution.teste;


import br.com.kasolution.dominio.Aluno;
import br.com.kasolution.dominio.Boletim;

public class TesteBoletim {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 123456, "Engenharia", new double[] { 7, 8, 9, 8 });
        Aluno aluno2 = new Aluno("Maria", 789025, "Direito", new double[] { 6, 7, 6, 7 });
        Aluno aluno3 = new Aluno("Pedro", 789012, "Medicina", new double[] { 9, 8, 9, 9 });
        Aluno aluno4 = new Aluno("Ana", new double[] { 8.0, 7.0, 8.5, 7.5 });

        Aluno[] alunos = { aluno1, aluno2, aluno3, aluno4 };

        Boletim boletim = new Boletim("20/02/2024 10:00", alunos);

        boletim.imprime();
    }
}
