package POO;

public class Preguiça extends Animal {
	
	private int subidaPreguica;
	
	public Preguiça (String nome, int idade, String som, int subidaPreguica) {
		super(nome, idade, som);
		this.subidaPreguica = subidaPreguica;
		
	}

	public int getSubidaPreguiça() {
		return subidaPreguica;
	}

	public void setSubidaPreguiça(int subidaPreguica) {
		this.subidaPreguica = subidaPreguica;
	}
	
	public void imprimirPreguiça() {
		System.out.println("\nA bicho preguiça "+getNome()+" tem "+getIdade()+" anos de idade, sobe em média "+subidaPreguica+
				" metros de árvore por hora, e emite o seguinte som: "+getSexo());
		
	}
	
	@Override
	public void fala(int vezes) {
		for (int i=0;i<vezes;i++) {
			System.out.println("\nHÃAH HÃAHN");
		}
	}
	
	@Override
	public void seMove(String speed) {
		System.out.println("\nA preguiça está subindo "+speed+" a árvore!");
	}

}