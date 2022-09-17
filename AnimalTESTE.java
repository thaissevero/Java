package POO;

import java.util.Scanner;

public class AnimalTESTE {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Cachorro dog = new Cachorro ("Hannibal",4,"au au au", 0);
		Cavalo horse = new Cavalo ("Jacinto", 1, "rinhõõõõ", 0);
		Preguiça sloth = new Preguiça ("Lilica",30,"HÃAH HÃAHN", 0);
		
		Animal animal = null;
		
		System.out.println("\nDados dos Animais:");
		dog.imprimirCachorro();
		horse.imprimirCavalo();
		sloth.imprimirPreguiça();
		
		
		System.out.println("\n\n\nEscola um dos animais citados acima:");
		System.out.println("\n1 - Cachorro");
		System.out.println("\n2 - Cavalo");
		System.out.println("\n3 - Preguiça");
		System.out.println("\nQual a sua escolha?");
		int n = leia.nextInt();
		

		switch(n) {
		case 1: animal = dog;break;
		case 2: animal = horse;break;
		case 3: animal= sloth;break;
		default:System.out.println("\nAnimal não encontrado");
		}
		
		
		int i = (int) (Math.random()*3.0);
		
		if(animal != null) {
			
			animal.fala(i);
			animal.seMove("rápido");
		}
		
	}

}