package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.print("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int multiplicacao = multiplicacao(a,b);
		int subtracao = subtracao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("soma: " + soma);
		System.out.println("subtracao: " + subtracao);
		System.out.println("multiplicacao: " + multiplicacao);
		System.out.printf("divisao: %.2f", divisao);
		
	}
	
	public static int soma(int a, int b) {
		return a + b;
		
	}

	public static int subtracao(int a, int b) {
		return a - b;
		
	}
	
	public static float divisao(float a, float b) {
		return a / b;
		
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
		
	}
}
