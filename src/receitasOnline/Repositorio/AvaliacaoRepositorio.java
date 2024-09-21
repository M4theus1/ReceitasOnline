package receitasOnline.Repositorio;
import java.util.ArrayList;
import java.util.List;

import receitasOnline.Entidades.Avaliacao;

//Implementação do repositório de avaliações
public class AvaliacaoRepositorio implements IAvaliacaoRepositorio{
	private List<Avaliacao> avaliacoes = new ArrayList<>();

	  // Método para adicionar uma avaliação ao repositório
    @Override
    public void adicionar(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    // Método para buscar uma avaliação pelo ID
    @Override
    public Avaliacao buscar(int id) {
        return avaliacoes.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

 // Método para atualizar as informações de uma avaliação
    @Override
    public void atualizar(Avaliacao avaliacao) {
        Avaliacao a = buscar(avaliacao.getId());
        if (a != null) {
            avaliacoes.remove(a);
            avaliacoes.add(avaliacao);
        }
    }

 // Método para remover uma avaliação pelo ID
    @Override
    public void remover(int id) {
        Avaliacao a = buscar(id);
        if (a != null) {
            avaliacoes.remove(a);
        }
    }

 // Método para listar todas as avaliações
    @Override
    public List<Avaliacao> listarTodas() {
        return new ArrayList<>(avaliacoes);
    }
}
