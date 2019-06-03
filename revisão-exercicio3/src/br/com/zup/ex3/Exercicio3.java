package br.com.zup.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numeroInicial ;
		numeroInicial = entrada.nextInt();
		
		List<Integer> lista = new ArrayList<Integer>(); 
		System.out.println("Digite um numero: ");
		int numeroFinal ;
		numeroFinal = entrada.nextInt();
		
		for (int numeroAdicionado = numeroInicial; numeroAdicionado <= numeroFinal ; numeroAdicionado++) {
			lista.add(numeroAdicionado);
			
		}
		System.out.println("Os números são: " + lista);
		

	}

}
