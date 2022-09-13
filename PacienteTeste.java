package POO;

public class PacienteTeste {

	public static void main(String[] args) {
		// Atividade
		
		Paciente pessoa = new Paciente ("Lilica Jesus",19,1.60,"Feminino");
		Paciente pessoa2 = new Paciente ("Marceline Severo",23,1.70,"Feminino");
		
	
		System.out.println("\n*****HOSPITAL*****");
		pessoa.imprimirInfo();
		System.out.println("\n");
		pessoa2.imprimirInfo();
		
		
	}

}
