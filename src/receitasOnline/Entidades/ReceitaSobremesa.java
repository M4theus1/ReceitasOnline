package receitasOnline.Entidades;

// A classe ReceitaSobremesa herda da classe Receita
public class ReceitaSobremesa extends Receita {
    // Atributo específico da classe ReceitaSobremesa
    private boolean contemAcucar;

    // Construtores sobrecarregados
    public ReceitaSobremesa() {}

    // Construtor sobrecarregado com parâmetros id, nome e contemAcucar
    public ReceitaSobremesa(int id, String nome, boolean contemAcucar) {
        super(id, nome);
        this.contemAcucar = contemAcucar;
    }

    // Método getter para acessar o atributo contemAcucar
    public boolean isContemAcucar() {
        return contemAcucar;
    }

    // Método setter para modificar o atributo contemAcucar
    public void setContemAcucar(boolean contemAcucar) {
        this.contemAcucar = contemAcucar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Contém Açúcar: " + contemAcucar;
    }
}
