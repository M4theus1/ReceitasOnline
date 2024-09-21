package receitasOnline.Repositorio;
import java.util.ArrayList;
import java.util.List;

import receitasOnline.Entidades.Receita;


//Implementação do repositório de receitas
public class ReceitaRepositorio implements IReceitaRepositorio {
	private List<Receita> receitas = new ArrayList<>();

	  // Método para adicionar uma receita ao repositório
	@Override
	public void adicionar(Receita receita) {
		// TODO Auto-generated method stub
		receitas.add(receita);
	}

	// Método para buscar uma receita pelo ID
	@Override
	public Receita buscar(int id) {
		// TODO Auto-generated method stub
		return receitas.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
	}

	// Método para atualizar as informações de uma receita
	@Override
	public void atualizar(Receita receita) {
		// TODO Auto-generated method stub
		Receita r = buscar(receita.getId());
		if(r != null) {
			receitas.remove(r);
			receitas.add(receita);
		}
	}
	
	// Método para remover uma receita pelo ID
	@Override
	public void remover(int id) {
		// TODO Auto-generated method stub
		Receita r = buscar(id);
		if(r != null) {
			receitas.remove(r);		}
	}

	// Método para listar todas as receitas
	@Override
	public List<Receita> listarTodas() {
		// TODO Auto-generated method stub
		return new ArrayList<>(receitas);
	}
}
