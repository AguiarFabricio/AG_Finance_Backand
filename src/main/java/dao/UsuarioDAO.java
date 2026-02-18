package dao;

import model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private List<Usuario> usuarios = new ArrayList<>();

    public void salvar(Usuario usuario) {
        usuarios.add(usuario);

    }

    public List<Usuario> listar() {
        return usuarios;
    }

    public Usuario buscarPorId(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public void remover(int id) {
        usuarios.removeIf(u -> u.getId() == id);
    }

}
