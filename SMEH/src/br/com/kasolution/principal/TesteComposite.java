package br.com.kasolution.principal;

public class TesteComposite {
	 public static void main(String[] args) {
	        ElementoFolha folha1 = new ElementoFolha();
	        ElementoFolha folha2 = new ElementoFolha();
	        ElementoComposto composto = new ElementoComposto();

	        composto.adicionarElemento(folha1);
	        composto.adicionarElemento(folha2);

	        composto.operacao();
	    }
	}
