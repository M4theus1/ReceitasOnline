package receitasOnline.Repositorio;

import receitasOnline.Entidades.Receita;
import receitasOnline.Estruturas.ListaEncadeada;

import java.util.List;

public class ReceitaRepositorio implements IReceitaRepositorio {
    private ListaEncadeada<Receita> listaReceitas;

    public ReceitaRepositorio() {
        this.listaReceitas = new ListaEncadeada<>();
    }

    @Override
    public void adicionar(Receita receita) {
        listaReceitas.adicionar(receita);
    }

    @Override
    public Receita buscar(int id) {
        return listaReceitas.buscar(id);
    }

    @Override
    public void atualizar(Receita receita) {
        listaReceitas.atualizar(receita);
    }

    @Override
    public void remover(int id) {
        listaReceitas.remover(id);
    }

    @Override
    public List<Receita> listarTodas() {
        return listaReceitas.listar();
    }

	@Override
	public List<Receita> listarTodos() {
		// TODO Auto-generated method stub
		return listaReceitas.listar();
	}


}
