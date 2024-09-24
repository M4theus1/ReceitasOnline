package receitasOnline.Entidades;

// A classe ReceitaPrincipal herda da classe Receita
public class ReceitaPrincipal extends Receita {
    // Atributo específico da classe ReceitaPrincipal
    private int tempoDePreparo; // Tempo de preparo da receita em minutos

    // Construtores sobrecarregados
    public ReceitaPrincipal() {}

    // Construtor sobrecarregado com parâmetros id, nome e tempoDePreparo
    public ReceitaPrincipal(int id, String nome, int tempoDePreparo) {
        super(id, nome);
        this.tempoDePreparo = tempoDePreparo;
    }

    // Método getter para acessar o atributo tempoDePreparo
    public int getTempoDePreparo() {
        return tempoDePreparo;
    }

    // Método setter para modificar o atributo tempoDePreparo
    public void setTempoDePreparo(int tempoDePreparo) {
        if (tempoDePreparo < 0) {
            throw new IllegalArgumentException("O tempo de preparo não pode ser negativo.");
        }
        this.tempoDePreparo = tempoDePreparo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tempo de Preparo: " + tempoDePreparo + " minutos";
    }
}
