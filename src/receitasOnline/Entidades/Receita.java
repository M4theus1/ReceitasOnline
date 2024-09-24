package receitasOnline.Entidades;

public class Receita {
    // Atributos da entidade RECEITA
    private int id; // Identificador único da receita
    private String nome; // Nome da receita
    private String descricao; // Descrição da receita

    // Construtores sobrecarregados
    public Receita() {}

    // Construtor sobrecarregado com parâmetros id e nome
    public Receita(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Construtor sobrecarregado com parâmetros id, nome e descricao
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Receita [ID: " + id + ", Nome: " + nome + ", Descrição: " + descricao + "]";
    }
}
