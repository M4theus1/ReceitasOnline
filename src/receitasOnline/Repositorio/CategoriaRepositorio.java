package receitasOnline.Repositorio;

import receitasOnline.Entidades.Categoria;
import receitasOnline.Estruturas.ListaEncadeada;

import java.util.List;

public class CategoriaRepositorio implements ICategoriaRepositorio {
    private ListaEncadeada<Categoria> listaCategorias;

    public CategoriaRepositorio() {
        this.listaCategorias = new ListaEncadeada<>();
    }

    @Override
    public void adicionar(Categoria categoria) {
        listaCategorias.adicionar(categoria);
    }

    @Override
    public Categoria buscar(int id) {
        return listaCategorias.buscar(id);
    }

    @Override
    public void atualizar(Categoria categoria) {
        listaCategorias.atualizar(categoria);
    }

    @Override
    public void remover(int id) {
        listaCategorias.remover(id);
    }

    @Override
    public List<Categoria> listarTodos() {
        return listaCategorias.listar();
    }

	@Override
	public List<Categoria> listarTodas() {
		// TODO Auto-generated method stub
		return listaCategorias.listar();
	}
}
