package com.targetsistemas.demo.exercicio_03;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.OptionalDouble;

@Service
public class FaturamentoService {

    private final FaturamentoRepository faturamentoRepository;

    public FaturamentoService(FaturamentoRepository faturamentoRepository) {
        this.faturamentoRepository = faturamentoRepository;
    }

    public FaturamentoStatistics getFaturamentoStatistics() {
        List<FaturamentoDiario> faturamentos = faturamentoRepository.findAll();

        if (faturamentos.isEmpty()) {
            return new FaturamentoStatistics(0, 0, 0);
        }

        double minFaturamento = faturamentos.stream()
                .mapToDouble(FaturamentoDiario::getFaturamento)
                .filter(f -> f > 0)
                .min()
                .orElse(0);

        double maxFaturamento = faturamentos.stream()
                .mapToDouble(FaturamentoDiario::getFaturamento)
                .filter(f -> f > 0)
                .max()
                .orElse(0);

        OptionalDouble averageOptional = faturamentos.stream()
                .mapToDouble(FaturamentoDiario::getFaturamento)
                .filter(f -> f > 0)
                .average();

        double averageFaturamento = averageOptional.orElse(0);

        long countAboveAverage = faturamentos.stream()
                .mapToDouble(FaturamentoDiario::getFaturamento)
                .filter(f -> f > averageFaturamento)
                .count();

        return new FaturamentoStatistics(minFaturamento, maxFaturamento, countAboveAverage);
    }
}
