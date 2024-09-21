package receitasOnline.Entidades;

//A classe ReceitaPrincipal herda da classe Receita
public class ReceitaPrincipal extends Receita{
	// Atributo específico da classe ReceitaPrincipal
	private int tempoDePreparo; // Tempo de preparo da receita em minutos
	
	//construtores sobrecarregados
	public ReceitaPrincipal() {}
	
	// Construtor sobrecarregado com parâmetros id, nome e tempoDePreparo
		// Chama o construtor da superclasse (Receita) com id e nome
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
		this.tempoDePreparo = tempoDePreparo;
	}
}
