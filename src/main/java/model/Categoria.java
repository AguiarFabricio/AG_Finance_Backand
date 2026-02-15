package model;

import java.io.Serializable;

public class Categoria implements Serializable {
    private int id;
    private String nome;
    private TipoTransacao tipo;
    
    public Categoria(int id, String nome, TipoTransacao tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public TipoTransacao getTipo() {
        return tipo;
    
    }
    
}