/*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
 (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
 ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; */

package questao01;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
	    int numero = in.nextInt();

	    // Chama o método que verifica se o número pertence à sequência de Fibonacci
	    if (pertenceFibonacci(numero)) {
	    	System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
	    } else {
	        System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
	    }
}

	    // verifica se um número pertence à sequência de Fibonacci
	    public static boolean pertenceFibonacci(int numero) {
	        int a = 0, b = 1;
	        
	        if (numero == 0 || numero == 1) {
	            return true;
	        }

	        // Calcula a sequência de Fibonacci
	        while (b < numero) {
	            int proximo = a + b;
	            a = b;
	            b = proximo;
	        }

	        return b == numero;
	    }
}