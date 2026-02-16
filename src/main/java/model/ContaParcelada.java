package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


public class ContaParcelada implements Serializable {
    
    private int id;
    private String descricao;
    private double VlorTotal;
    private int numeroParcelas;
    private LocalDate dataInicio;
    private Usuario usuario;
    private List<Parcela> parcelas;
    
    
}