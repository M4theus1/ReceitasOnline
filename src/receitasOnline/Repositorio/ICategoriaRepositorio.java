package receitasOnline.Repositorio;
import receitasOnline.Entidades.Categoria;
import java.util.List;

//Interface para o repositório de categorias
public interface ICategoriaRepositorio {
	 // Método para adicionar uma categoria
	void adicionar(Categoria categoria);
	 // Método para buscar uma categoria pelo ID
	Categoria buscar(int id);
	// Método para atualizar as informações de uma categoria
	void atualizar(Categoria categoria);
	// Método para remover uma categoria pelo ID
	void remover(int id);
	// Método para listar todas as categorias
	List<Categoria> listarTodas();
}	
