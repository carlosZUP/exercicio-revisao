package br.com.zup.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<Integer> media = new ArrayList<Integer>();
		List<Integer> numeroPar = new ArrayList<Integer>();

		List<Integer> numeroImpar = new ArrayList<Integer>();

		int continuar = 1;
		while (continuar != 0) {

			System.out.println("Digite os numeros: ");
			int numero = entrada.nextInt();
			
			if (numero == 0) {
				continuar = 0;
				
			} else {
				if (numero % 2 == 0) {
					numeroPar.add(numero);
				} else {
					numeroImpar.add(numero);
				}
			}
		}
		
		int resultado = 0;
		for (Integer numero : numeroPar) {
			resultado = numero + resultado;
		}

		resultado = resultado / numeroPar.size();
		System.out.println("O resultado da média é: " + resultado);
		System.out.println("Lista dos numeros imapares: " + numeroImpar);
	}

}
