package receitasOnline.Entidades;

public class Avaliacao {
	//atributos da entidade AVALIACAO
	private int id; //Identificador único da avaliação
	private int nota; //Nota atribuída na avaliação
	private String comentario; //Comentário adicional da avaliação
	
	//construtores sobrecarregados
	public Avaliacao() {}
	
	public Avaliacao(int id, int nota) {
		this.id = id;
		this.nota = nota;
	}
	
	// Construtor sobrecarregado com parâmetros id e nota
	public Avaliacao(int id, int nota, String comentario) {
		this.id = id;
		this.nota = nota;
	}
	
	// Métodos getter para acessar os atributos
	public int getId() {
		return id;
	}
	
	public int getNota() {
		return nota;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	// Métodos setter para modificar os atributos
	public void setId() {
		this.id = id;
	}
	
	public void setNota() {
		this.nota = nota;
	}
	
	public void setComentario() {
		this.comentario = comentario;
	}
	
}
