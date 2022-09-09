package atividades;

import java.util.Scanner;

public class repetição2 {

	public static void main(String[] args) {
		/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. FOR */
		
		float numeros = 0;
		int x,contPar=0,contImpar=0;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=1;x<=10;x++) {
			System.out.println("\nEntre com um número: ");
			numeros = leia.nextFloat();
			if(numeros % 2 == 0) {
				contPar++;
			}else {
				contImpar++;
			}
		}
		System.out.println("\nQuantidade de número(s) par(es): "+contPar);
		System.out.println("\nQuantidade de número(s) ímpar(es): "+contImpar);
		

	}

}