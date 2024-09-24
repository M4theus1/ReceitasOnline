package receitasOnline.Repositorio;

import receitasOnline.Entidades.Ingrediente;
import receitasOnline.Estruturas.ListaEncadeada;

import java.util.List;

public class IngredienteRepositorio implements IIngredienteRepositorio {
    private ListaEncadeada<Ingrediente> listaIngredientes;

    public IngredienteRepositorio() {
        this.listaIngredientes = new ListaEncadeada<>();
    }

    @Override
    public void adicionar(Ingrediente ingrediente) {
        listaIngredientes.adicionar(ingrediente);
    }

    @Override
    public Ingrediente buscar(int id) {
        return listaIngredientes.buscar(id);
    }

    @Override
    public void atualizar(Ingrediente ingrediente) {
        listaIngredientes.atualizar(ingrediente);
    }

    @Override
    public void remover(int id) {
        listaIngredientes.remover(id);
    }

    @Override
    public List<Ingrediente> listarTodos() {
        return listaIngredientes.listar();
    }
}
