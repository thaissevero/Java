package POO;

public abstract class Animal {
	
	private String nome;
	private String sexo;
	private int idade;
	private String emitirSom;

	public Animal (String nome, String sexo, String emitirSom, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.emitirSom = emitirSom;
		this.idade = idade;
	}
	
	// criação dos getter and setters

	public Animal(String nome2, int idade2, String som) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
// criação do metódo emitir som
	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public void fala(int vezes) {
		// TODO Auto-generated method stub
		
	}

	public void seMove(String speed) {
		// TODO Auto-generated method stub
		
	}
	
}