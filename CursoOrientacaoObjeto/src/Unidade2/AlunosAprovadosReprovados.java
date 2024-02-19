package Unidade2;

import java.util.Scanner;

public class AlunosAprovadosReprovados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Digite um numero de Alunos");
		int numeroAlunos = scanner.nextInt();
		
		double nota1,nota2;
		double media = 0;
		double mediaTurma = 0;
		int numeroAlunosAprovados = 0, numeroAlunosReprovados = 0;
		
		for (int i = 0; i < numeroAlunos; i++)
		{
			System.out.println("Digite a primeira nota do aluno:" + (i+1));
			nota1 = scanner.nextDouble();
			
			System.out.println("Digite a segunda nota do aluno:" + (i+1));
			nota2 = scanner.nextDouble();
			
			media = (nota1+nota2)/2;
			
			if (media >= 6)
				numeroAlunosAprovados++;
			else 
				numeroAlunosReprovados++;
			
			mediaTurma = mediaTurma + media;
		}
		mediaTurma = mediaTurma/numeroAlunos;
		
		System.out.println("numero de Alunos Aprovados="  + numeroAlunosAprovados);
		System.out.println("numero de Alunos Reprovados="  + numeroAlunosReprovados);
		System.out.println("A media aritimetica da turma ="  + mediaTurma);
		scanner.close();
		
		
		

	}

}
