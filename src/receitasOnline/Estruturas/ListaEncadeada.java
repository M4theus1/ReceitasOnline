package receitasOnline.Estruturas;

import java.util.ArrayList;
import java.util.List;

import receitasOnline.Entidades.Avaliacao;
import receitasOnline.Entidades.Usuario;

class Nodo<T> {
    T dado;
    Nodo<T> proximo;

    public Nodo(T dado) {
        this.dado = dado;
        this.proximo = null;
    }
}

public class ListaEncadeada<T> {
    private Nodo<T> cabeca;

    public ListaEncadeada() {
        this.cabeca = null;
    }

    public void adicionar(T dado) {
        Nodo<T> novoNodo = new Nodo<>(dado);
        if (cabeca == null) {
            cabeca = novoNodo;
        } else {
            Nodo<T> temp = cabeca;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novoNodo;
        }
    }

    public T buscar(int id) {
        Nodo<T> temp = cabeca;
        while (temp != null) {
            if (temp.dado instanceof Usuario && ((Usuario) temp.dado).getId() == id) {
                return temp.dado;
            }
            // Adicione lógica semelhante para outras entidades conforme necessário
            temp = temp.proximo;
        }
        return null; // Retorna null se não encontrar
    }

    public void atualizar(T dado) {
        Nodo<T> temp = cabeca;
        while (temp != null) {
            if (temp.dado instanceof Usuario && ((Usuario) temp.dado).getId() == ((Usuario) dado).getId()) {
                temp.dado = dado; // Atualiza o dado
                return;
            }
            if (temp.dado instanceof Avaliacao && ((Avaliacao) temp.dado).getId() == ((Avaliacao) dado).getId()) {
                temp.dado = dado; // Atualiza o dado
                return;
            }
            // Continue com outras entidades conforme necessário
            temp = temp.proximo;
        }
    }

    public void remover(int id) {
        if (cabeca == null) return; // Lista vazia

        if (cabeca.dado instanceof Usuario && ((Usuario) cabeca.dado).getId() == id) {
            cabeca = cabeca.proximo; // Remove o primeiro nodo
            return;
        }

        Nodo<T> temp = cabeca;
        while (temp.proximo != null) {
            if (temp.proximo.dado instanceof Usuario && ((Usuario) temp.proximo.dado).getId() == id) {
                temp.proximo = temp.proximo.proximo; // Remove o nodo
                return;
            }
            temp = temp.proximo;
        }
    }

    public List<T> listar() {
        List<T> lista = new ArrayList<>();
        Nodo<T> temp = cabeca;
        while (temp != null) {
            lista.add(temp.dado);
            temp = temp.proximo;
        }
        return lista;
    }
}