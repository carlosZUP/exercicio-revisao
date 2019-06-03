package br.com.zup.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite o numero da tabuada desejada:");
		num = sc.nextInt();
		List<Integer> tabuada = new ArrayList<Integer>();
		
		System.out.println("Tabuada do " + num);
		for(int num1 = 1; num1 <= 10; num1 ++) {

			System.out.println(num + " x " + num1 + " = " + num*num1 );
			
		}

	}

}
