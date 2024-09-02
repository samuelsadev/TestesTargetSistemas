package com.targetsistemas.demo.exercicio_03;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer{

    private final FaturamentoRepository faturamentoRepository;

    public DataInitializer(FaturamentoRepository faturamentoRepository) {
        this.faturamentoRepository = faturamentoRepository;
    }

    @PostConstruct
    public void initialize() {
        faturamentoRepository.save(new FaturamentoDiario(120.0));
        faturamentoRepository.save(new FaturamentoDiario(250.0));
        faturamentoRepository.save(new FaturamentoDiario(0.0));
        faturamentoRepository.save(new FaturamentoDiario(80.0));
        faturamentoRepository.save(new FaturamentoDiario(300.0));
        faturamentoRepository.save(new FaturamentoDiario(90.0));
        faturamentoRepository.save(new FaturamentoDiario(150.0));
    }
}