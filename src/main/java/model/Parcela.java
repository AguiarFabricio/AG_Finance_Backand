package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Parcela implements Serializable {

    private int id;
    private int numeroParcela;
    private double valor;
    private LocalDate dataVencimento;
    private boolean paga;
    private ContaParcelada contaParcelada;

    public Parcela(int id, int numeroParcela, double valor, LocalDate dataVencimento, boolean paga, ContaParcelada contaParcela) {

        this.id = id;
        this.numeroParcela = numeroParcela;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.paga = paga;
        this.contaParcelada = contaParcelada;

    }

    public int getId() {
        return id;
    }

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public boolean isPaga() {
        return paga;
    }

    public ContaParcelada getContaParcelada() {
        return contaParcelada;
    }

}
