package receitasOnline.Repositorio;

import receitasOnline.Entidades.Usuario;
import receitasOnline.Estruturas.ListaEncadeada;

import java.util.List;

public class UsuarioRepositorio implements IUsuarioRepositorio {
    private ListaEncadeada<Usuario> listaUsuarios;

    public UsuarioRepositorio() {
        this.listaUsuarios = new ListaEncadeada<>();
    }

    @Override
    public void adicionar(Usuario usuario) {
        listaUsuarios.adicionar(usuario);
    }

    @Override
    public Usuario buscar(int id) {
        return listaUsuarios.buscar(id);
    }

    @Override
    public void atualizar(Usuario usuario) {
        listaUsuarios.atualizar(usuario);
    }

    @Override
    public void remover(int id) {
        listaUsuarios.remover(id);
    }

    @Override
    public List<Usuario> listarTodos() {
        return listaUsuarios.listar();
    }
}
