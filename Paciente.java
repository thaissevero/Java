package POO;

public class Paciente {	
	// 7) Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as informações deste objeto no console.
	
	private String nomePaciente;
	private int idade;
	private double altura;
	private String sexo;
	
	public Paciente(String nomePaciente, int idade, double altura, String sexo) {
		
			this.nomePaciente = nomePaciente;
			this.idade = idade;
			this.altura = altura;
			this.sexo = sexo;
			
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void imprimirInfo () {
		System.out.println("Nome do paciente: "+nomePaciente);
		System.out.println("Idade: "+idade);
		System.out.println("Altura: "+altura);
		System.out.println("Sexo do paciente: "+sexo);
		
	}
	
	

}
