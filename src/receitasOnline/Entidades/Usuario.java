package receitasOnline.Entidades;

public class Usuario {
    // Atributos da entidade USUARIO
    private int id; // Identificador único do usuário
    private String nome; // Nome do usuário
    
    // Construtores sobrecarregados
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
    public void setId(int id) {
        this.id = id; // Modifica o id
    }
    
    public void setNome(String nome) {
        this.nome = nome; // Modifica o nome
    }
}
