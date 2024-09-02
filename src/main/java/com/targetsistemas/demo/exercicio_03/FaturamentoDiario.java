package com.targetsistemas.demo.exercicio_03;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FaturamentoDiario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double faturamento;

    public FaturamentoDiario(){
    }

    public FaturamentoDiario(double faturamento){
        this.faturamento = faturamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }
}