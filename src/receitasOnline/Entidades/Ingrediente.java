package receitasOnline.Entidades;

public class Ingrediente {
	//atributos da entidade INGREDIENTE
	private int id; // Identificador único do ingrediente
	private String nome; // Nome do ingrediente
	
	//construtores sobrecarregados
	public Ingrediente() {}
	
	public Ingrediente(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	// Métodos getter para acessar os atributos
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	// Métodos setter para modificar os atributos
	
	public void setId() {
		this.id = id;
	}
	
	public void setNome() {
		this.nome = nome;
	}
}
