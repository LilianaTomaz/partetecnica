/* Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, 
além de informar a quantidade de vezes em que ela ocorre.IMPORTANTE: Essa string pode ser informada através 
de qualquer entrada de sua preferência ou pode ser previamente definida no código; */ 

package questao02;
import java.util.Scanner;

public class frase {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = in.nextLine();
		
		String minuscula = frase.toLowerCase();
		String maiuscula = frase.toUpperCase(); 
		int contador = 0;

        // Percorre a string e conta quantas vezes 'a' aparece
        for (int i = 0; i < minuscula.length(); i++) {
            if (minuscula.charAt(i) == 'a') {
                contador++;
            }
        }

        // Verifica se a letra 'a' foi encontrada
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }

	}

}
