package receitasOnline.Repositorio;

import receitasOnline.Entidades.Avaliacao;
import receitasOnline.Estruturas.ListaEncadeada;

import java.util.List;

public class AvaliacaoRepositorio implements IAvaliacaoRepositorio {
    private ListaEncadeada<Avaliacao> listaAvaliacoes;

    public AvaliacaoRepositorio() {
        this.listaAvaliacoes = new ListaEncadeada<>();
    }

    @Override
    public void adicionar(Avaliacao avaliacao) {
        listaAvaliacoes.adicionar(avaliacao);
    }

    @Override
    public Avaliacao buscar(int id) {
        return listaAvaliacoes.buscar(id);
    }

    @Override
    public void atualizar(Avaliacao avaliacao) {
        listaAvaliacoes.atualizar(avaliacao);
    }

    @Override
    public void remover(int id) {
        listaAvaliacoes.remover(id);
    }

    @Override
    public List<Avaliacao> listarTodos() {
        return listaAvaliacoes.listar();
    }

	@Override
	public List<Avaliacao> listarTodas() {
		// TODO Auto-generated method stub
		return listaAvaliacoes.listar();
	}
}
