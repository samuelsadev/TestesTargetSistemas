package com.targetsistemas.demo.exercicio_03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faturamento")
public class FaturamentoController {

    private final FaturamentoService faturamentoService;

    public FaturamentoController(FaturamentoService faturamentoService) {
        this.faturamentoService = faturamentoService;
    }

    @GetMapping("/estatisticas")
    public FaturamentoStatistics getEstatisticas() {
        return faturamentoService.getFaturamentoStatistics();
    }
}
