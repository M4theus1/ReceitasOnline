package receitasOnline.Repositorio;
import java.util.ArrayList;
import java.util.List;

import receitasOnline.Entidades.Usuario;

//Implementação do repositório de usuários
public class UsuarioRepositorio implements IUsuarioRepositorio{
	
	 private List<Usuario> usuarios = new ArrayList<>();// Lista de usuários

	// Método para adicionar um usuário ao repositório
	    @Override
	    public void adicionar(Usuario usuario) {
	        usuarios.add(usuario);
	    }

	 // Método para buscar um usuário pelo ID
	    @Override
	    public Usuario buscar(int id) {
	        return usuarios.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
	    }

	    // Método para atualizar as informações de um usuário
	    @Override
	    public void atualizar(Usuario usuario) {
	        Usuario u = buscar(usuario.getId());
	        if (u != null) {
	            usuarios.remove(u);
	            usuarios.add(usuario);
	        }
	    }

	 // Método para remover um usuário pelo ID
	    @Override
	    public void remover(int id) {
	        Usuario u = buscar(id);
	        if (u != null) {
	            usuarios.remove(u);
	        }
	    }

	 // Método para listar todos os usuários
	    @Override
	    public List<Usuario> listarTodos() {
	        return new ArrayList<>(usuarios);
	    }
}
