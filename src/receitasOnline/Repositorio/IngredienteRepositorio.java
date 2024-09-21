package receitasOnline.Repositorio;
import java.util.ArrayList;
import java.util.List;

import receitasOnline.Entidades.Ingrediente;

//Implementação do repositório de ingredientes
public class IngredienteRepositorio implements IIngredienteRepositorio{
	 private List<Ingrediente> ingredientes = new ArrayList<>();

	// Método para adicionar um ingrediente ao repositório
	    @Override
	    public void adicionar(Ingrediente ingrediente) {
	        ingredientes.add(ingrediente);
	    }

	 // Método para buscar um ingrediente pelo ID
	    @Override
	    public Ingrediente buscar(int id) {
	        return ingredientes.stream().filter(i -> i.getId() == id).findFirst().orElse(null);
	    }

	 // Método para atualizar as informações de um ingrediente
	    @Override
	    public void atualizar(Ingrediente ingrediente) {
	        Ingrediente i = buscar(ingrediente.getId());
	        if (i != null) {
	            ingredientes.remove(i);
	            ingredientes.add(ingrediente);
	        }
	    }

	 // Método para remover um ingrediente pelo ID
	    @Override
	    public void remover(int id) {
	        Ingrediente i = buscar(id);
	        if (i != null) {
	            ingredientes.remove(i);
	        }
	    }

	 // Método para listar todos os ingredientes
	    @Override
	    public List<Ingrediente> listarTodos() {
	        return new ArrayList<>(ingredientes);
	    }
}
