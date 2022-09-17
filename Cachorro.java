package POO;

public class  Cachorro extends Animal{
	
	private int velocidadeCachorro;
	
	public Cachorro (String nome, int idade, String som, int velocidadeCachorro) {
		super(nome, idade, som);
		this.velocidadeCachorro = velocidadeCachorro;
		
	}

	public int getVelocidadeCachorro() {
		return velocidadeCachorro;
	}

	public void setVelocidadeCachorro(int velocidadeCachorro) {
		this.velocidadeCachorro = velocidadeCachorro;
	}
	
	public void imprimirCachorro() {
		System.out.println("\nO cachorro "+getNome()+" tem "+getIdade()+" anos de idade, corre a uma velocidade média de "+velocidadeCachorro+
				"km por hora, e emite o seguinte som: "+getEmitirSom());
	}
	
	public void fala(int vezes) {
		for (int i=0;i<vezes;i++) {
			System.out.println("\nau au au");
		}
	}
	
	@Override
	public void seMove(String velocidadeCachorro) {
		System.out.println("\nO cachorro está correndo "+velocidadeCachorro+" em sua direção!!!");
	}
	
}