package Lista2_LACO_DE_DECISAO;

import java.util.Scanner;

public class tarefa3 {

	/*
	 * Fa�a um programa que receba a idade de uma pessoa
	 * e mostre na sa�da em qual categoria ela se encontra:
	 * 10-14 infantil
       15-17 juvenil
       18-25 adulto
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		
		if(idade >=10 && idade <= 14) {
			System.out.printf("Voc� � Infantil");
		}
		
		else if(idade >14 && idade <= 17) {
			System.out.printf("Voc� � juvenil");
		}
		
		else if(idade > 17 && idade <=25) {
			System.out.println("Voc� � adulto");
		}

	}

}
