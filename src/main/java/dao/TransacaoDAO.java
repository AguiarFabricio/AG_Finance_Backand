package dao;

import model.Transacao;
import java.util.ArrayList;
import java.util.List;


public class TransacaoDAO {
    
    private List<Transacao> transacoes = new ArrayList<>();
    
    public void salvar(Transacao transacao) {
        transacoes.add(transacao);
    }
    
    public List<Transacao> list() {
        return transacoes;
    }
    
    public Transacao buscarPorId(int id) {
        for (Transacao t : transacoes) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
    
    public void remover(int id) {
        transacoes.removeIf(t -> t.getId() == id);
    }
}