package receitasOnline.Entidades;

//A classe ReceitaSobremesa herda da classe Receita
public class ReceitaSobremesa  extends Receita{
	// Atributo específico da classe ReceitaSobremesa
	private boolean contemAcucar;
	
	//contrutores sobrecarregados
	public ReceitaSobremesa() {}
	
	// Construtor sobrecarregado com parâmetros id, nome e contemAcucar
		// Chama o construtor da superclasse (Receita) com id e nome
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
}
