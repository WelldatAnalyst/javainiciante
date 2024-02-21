package br.com.kasolution.dominio;

public class Aluno {

	private String nome;
	private long numeroMatricula;
	private String curso;
	private double[] notas;

	public Aluno(String nome, long numeroMatricula, String curso, double[] notas) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
		this.curso = curso;
		this.notas = notas;
	}

	public Aluno(String nome, String curso, double[] notas) {
		this(nome, 0, curso, notas);
	}

	public Aluno(String nome, double[] notas) {
		this(nome, "", notas);
	}

	public double obterMedia() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / notas.length;
	}

	public boolean obterAprovacao() {
		return obterMedia() >= 7;
	}

	public void imprime() {
		System.out.println("Nome: " + nome);
		System.out.println("Número de Matrícula: " + numeroMatricula);
		System.out.println("Curso: " + curso);
		System.out.println("Notas: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("   Nota " + (i + 1) + ": " + notas[i]);
		}
		System.out.println("Média: " + obterMedia());
		System.out.println("Status de Aprovação: " + (obterAprovacao() ? "Aprovado" : "Reprovado"));
	}
}