package receitasOnline.Entidades;

public class Receita {
	//atributos da entidade RECEITA
	private int id; // Identificador único da receita
	private String nome; // Nome da receita
	private String descricao; // Descrição da receita
	
	//construtores sobrecarregados
	public Receita() {}
	
	// Construtor sobrecarregado com parâmetros id e nome
	public Receita(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	// Construtor sobrecarregado com parâmetros id, nome e descricao
	// Chama o outro construtor com id e nome e, em seguida, define a descricao
	public Receita(int id, String nome, String descricao) {
		this(id, nome);
		this.descricao = descricao;
	}

	// Métodos getter para acessar os atributos
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	// Métodos setter para modificar os atributos
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome() {
		this.nome = nome;
	}
	
	public void setDescricao() {
		this.descricao = descricao;
	}
}
