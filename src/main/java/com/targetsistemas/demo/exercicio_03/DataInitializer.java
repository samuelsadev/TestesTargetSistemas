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
        faturamentoRepository.save(new FaturamentoDiario(22174.1664)); // Dia 1
        faturamentoRepository.save(new FaturamentoDiario(24537.6698)); // Dia 2
        faturamentoRepository.save(new FaturamentoDiario(26139.6134)); // Dia 3
        faturamentoRepository.save(new FaturamentoDiario(0.0));        // Dia 4
        faturamentoRepository.save(new FaturamentoDiario(0.0));        // Dia 5
        faturamentoRepository.save(new FaturamentoDiario(26742.6612)); // Dia 6
        faturamentoRepository.save(new FaturamentoDiario(0.0));        // Dia 7
        faturamentoRepository.save(new FaturamentoDiario(42889.2258)); // Dia 8
        faturamentoRepository.save(new FaturamentoDiario(46251.174));  // Dia 9
        faturamentoRepository.save(new FaturamentoDiario(11191.4722)); // Dia 10
        faturamentoRepository.save(new FaturamentoDiario(0.0));        // Dia 11
        faturamentoRepository.save(new FaturamentoDiario(0.0));        // Dia 12
        faturamentoRepository.save(new FaturamentoDiario(3847.4823));  // Dia 13
        faturamentoRepository.save(new FaturamentoDiario(373.7838));   // Dia 14
        faturamentoRepository.save(new FaturamentoDiario(2659.7563));  // Dia 15
        faturamentoRepository.save(new FaturamentoDiario(48924.2448)); // Dia 16
        faturamentoRepository.save(new FaturamentoDiario(18419.2614)); // Dia 17
        faturamentoRepository.save(new FaturamentoDiario(0.0));        // Dia 18
        faturamentoRepository.save(new FaturamentoDiario(0.0));        // Dia 19
        faturamentoRepository.save(new FaturamentoDiario(35240.1826)); // Dia 20
        faturamentoRepository.save(new FaturamentoDiario(43829.1667)); // Dia 21
        faturamentoRepository.save(new FaturamentoDiario(18235.6852)); // Dia 22
        faturamentoRepository.save(new FaturamentoDiario(4355.0662));  // Dia 23
        faturamentoRepository.save(new FaturamentoDiario(13327.1025)); // Dia 24
        faturamentoRepository.save(new FaturamentoDiario(0.0));        // Dia 25
        faturamentoRepository.save(new FaturamentoDiario(0.0));        // Dia 26
        faturamentoRepository.save(new FaturamentoDiario(25681.8318)); // Dia 27
        faturamentoRepository.save(new FaturamentoDiario(1718.1221));  // Dia 28
        faturamentoRepository.save(new FaturamentoDiario(13220.495));  // Dia 29
        faturamentoRepository.save(new FaturamentoDiario(8414.61));    // Dia 30
    }
}