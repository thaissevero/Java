package atividades;

import java.util.Scanner;

public class repetição6 {

	public static void main(String[] args) {
		/* Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números 
		 * múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE) */
		
		int numeros,somaNum=0,contNum=0;
		float media;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um número: ");
		numeros = leia.nextInt();
		
		do {
			
			if(numeros == 0) {
				System.out.println("\nSair do loop");
			}else {
				if(numeros%3==0) {
					somaNum += numeros;
					contNum++;
				}
				System.out.println("\nEntre com um número: ");
				numeros = leia.nextInt();
			}
			
		}while(numeros != 0);
		
		if(contNum == 0) {
			System.out.println("\nNão é possível fazer divisão por zero.");
		}else {
			
		media = (somaNum)/ contNum;
		System.out.printf("\nMédia dos números múltiplos de 3: %.2f ",media);
	}

}
	}