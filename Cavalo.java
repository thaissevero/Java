package POO;

public class  Cavalo extends Animal{
	
	private int velocidadeCavalo;
	
	public Cavalo (String nome, int idade, String som, int velocidadeCavalo) {
		super(nome, idade, som);
		this.velocidadeCavalo = velocidadeCavalo;
		
	}

	public int getVelocidadeCavalo() {
		return velocidadeCavalo;
	}

	public void setVelocidadeCavalo(int velocidadeCavalo) {
		this.velocidadeCavalo = velocidadeCavalo;
	}
	
	public void imprimirCavalo() {
		System.out.println("\nO cavalo"+getNome()+" tem "+getIdade()+" anos de idade, corre a uma velocidade média de "+velocidadeCavalo+
				"km por hora, e emite o seguinte som: "+getEmitirSom());
		
	}
	
	@Override
	public void fala(int vezes) {
		for (int i=0;i<vezes;i++) {
			System.out.println("\nrinhõõõõ");
		}
	}
	
	@Override
	public void seMove(String velocidadeCavalo) {
		System.out.println("\nO cavalo está correndo "+velocidadeCavalo+" no campo!");
	}
	
}