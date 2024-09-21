package receitasOnline.Repositorio;
import receitasOnline.Entidades.Ingrediente;
import java.util.List;

//Interface para o repositório de ingredientes
public interface IIngredienteRepositorio {
	// Método para adicionar um ingrediente
	void adicionar(Ingrediente ingrediente);
	// Método para buscar um ingrediente pelo ID
	Ingrediente buscar(int id);
	   // Método para atualizar as informações de um ingrediente
	void atualizar(Ingrediente ingrediente);
	// Método para remover um ingrediente pelo ID
	void remover(int id);
	 // Método para listar todos os ingredientes
	List<Ingrediente> listarTodos();
}
