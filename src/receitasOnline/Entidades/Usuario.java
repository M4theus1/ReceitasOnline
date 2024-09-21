package receitasOnline.Entidades;

public class Usuario {
	//atributos da entidade USUARIO
	private int id; // Identificador único do usuário
	private String nome; // Nome do usuário
	
	//construtores sobrecarregados
	public Usuario() {}
	
	// Construtor sobrecarregado com parâmetros id e nome
	public Usuario(int id, String nome) {
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
