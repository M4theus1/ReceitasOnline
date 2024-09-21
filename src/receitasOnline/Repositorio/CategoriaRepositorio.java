package receitasOnline.Repositorio;
import java.util.ArrayList;
import java.util.List;

import receitasOnline.Entidades.Categoria;

//Implementação do repositório de categorias
public class CategoriaRepositorio implements ICategoriaRepositorio{
	private List<Categoria> categorias = new ArrayList<>();

	// Método para adicionar uma categoria ao repositório
    @Override
    public void adicionar(Categoria categoria) {
        categorias.add(categoria);
    }

 // Método para buscar uma categoria pelo ID
    @Override
    public Categoria buscar(int id) {
        return categorias.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

 // Método para atualizar as informações de uma categoria
    @Override
    public void atualizar(Categoria categoria) {
        Categoria c = buscar(categoria.getId());
        if (c != null) {
            categorias.remove(c);
            categorias.add(categoria);
        }
    }

 // Método para remover uma categoria pelo ID
    @Override
    public void remover(int id) {
        Categoria c = buscar(id);
        if (c != null) {
            categorias.remove(c);
        }
    }

 // Método para listar todas as categorias
    @Override
    public List<Categoria> listarTodas() {
        return new ArrayList<>(categorias);
    }
}
