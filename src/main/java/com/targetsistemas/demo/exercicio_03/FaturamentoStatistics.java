package com.targetsistemas.demo.exercicio_03;

public class FaturamentoStatistics {
    private final double minFaturamento;
    private final double maxFaturamento;
    private final long countAboveAverage;

    public FaturamentoStatistics(double minFaturamento, double maxFaturamento, long countAboveAverage) {
        this.minFaturamento = minFaturamento;
        this.maxFaturamento = maxFaturamento;
        this.countAboveAverage = countAboveAverage;
    }

    public double getMinFaturamento() {
        return minFaturamento;
    }

    public double getMaxFaturamento() {
        return maxFaturamento;
    }

    public long getCountAboveAverage() {
        return countAboveAverage;
    }
}
