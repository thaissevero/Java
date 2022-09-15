package POO;

public class Cavalo   extends Animal{
	
	private String deslocar;

	public Cavalo(String nome, String sexo, int idade, String emitirSom, String deslocar){
		super (nome, sexo, emitirSom, idade);
		
		this.deslocar = deslocar;
	}
	
	public String getCorrer() {
		return deslocar;
	}

	public void setCorrer(String correr) {
		this.deslocar = correr;
	}

	public void imprimirCavalo() {
		System.out.println("\n\t\tFicha do Animal"+  "\n\nNome: "+getNome()+"\nIdade: "+getIdade()+ " anos"+
				"\nSexo: " +getSexo()+ "\nEmite o som: " +emitirSom+ "\nMovimentação: "+deslocar);
	}
}