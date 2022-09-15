package POO;

public class AnimalTESTE {

public static void main(String[] args) {
		
		Cachorro dog = new Cachorro ("Hannibal","Macho",4,"au au au","tsc tsc");
		Cavalo horse = new Cavalo ("Jacinto","Macho", 1,"rinhõõõõ","troc troc troc");
		Preguiça sloth = new Preguiça ("Lilica","femea",30,"HÃAH HÃAHN","trek trek trek");
		
		System.out.println("\nDados dos Animais:");
		dog.imprimirCachorro();
		horse.imprimirCavalo();
		sloth.imprimirPreguiça();

		}
		
	}
