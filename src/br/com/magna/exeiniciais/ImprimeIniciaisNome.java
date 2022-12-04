package br.com.magna.exeiniciais;

public class ImprimeIniciaisNome {

	public static void main(String[] args) {
		imprimeP();
		imprimeH();
		imprimeL();
		imprimeF();
	}

	public static void imprimeP() {
		// O array que faz a construção da letra
		String[] p = { "******\n", "*    *\n", "******\n", "*\n*" };

		// O laço que imprime cada posição do array
		for (String elemento : p) {
			System.out.print(elemento);
		}

		System.out.println();
		System.out.println("-----------");
		System.out.println();
	}

	public static void imprimeH() {
		String[] h = { "*    *\n", "*    *\n", "******\n", "*    *\n", "*    *" };

		for (String elemento : h) {
			System.out.print(elemento);
		}

		System.out.println();
		System.out.println("-----------");
		System.out.println();
	}
	
	public static void imprimeL() {
		String[] l = { "*\n*\n*\n*\n", "******" };

		for (String elemento : l) {
			System.out.print(elemento);
		}

		System.out.println();
		System.out.println("-----------");
		System.out.println();
	}
	
	public static void imprimeF() {
		String[] f = { "******\n", "*\n", "******\n", "*\n", "*" };
		
		for (String elemento : f) {
			System.out.print(elemento);
		}
	}
}
