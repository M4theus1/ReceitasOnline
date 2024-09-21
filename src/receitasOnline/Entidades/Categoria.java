package receitasOnline.Entidades;

public class Categoria {
	//atributos da entidade CATEGORIA
	private int id; // Identificador único da categoria
	private String nome; // Nome da categoria
	
	//construtores sobrecarregados
	public Categoria() {}
	
	public Categoria(int id, String nome) {
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
