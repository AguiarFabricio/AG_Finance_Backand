package dao;

import model.Categoria;
import  java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    
    private List<Categoria> categorias = new ArrayList<>();
    
    public void salvar(Categoria categoria) {
        categoria.add(categoria);
    }
    
    public List<Categoria> listar() {
        return categorias;
    }
    
    public Categoria buscarPorId(int id) {
        for (Categoria c : categorias) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
    
    public void remover(int id) {
        categorias.removeIf(c -> c.getId() == id);
    }
}