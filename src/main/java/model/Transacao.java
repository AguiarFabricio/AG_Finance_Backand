package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Transacao implements Serializable {

    private int id;
    private String descricao;
    private double valor;
    private LocalDate data;
    private TipoTransacao tipo;
    private Categoria categoria;
    private Usuario usuario;

    public Transacao(int id, String descricao, double valor, LocalDate data, TipoTransacao tipo, Categoria categoria, Usuario usuario) {

        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
        this.categoria = categoria;
        this.usuario = usuario;

    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

}
