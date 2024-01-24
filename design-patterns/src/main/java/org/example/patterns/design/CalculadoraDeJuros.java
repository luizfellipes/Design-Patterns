package org.example.patterns.design;

import org.example.patterns.design.strategyInterface.CalculaJurosStrategyInterface;

public class CalculadoraDeJuros {

    private CalculaJurosStrategyInterface calculadorDeJuros;

    public CalculadoraDeJuros(CalculaJurosStrategyInterface calculadorDeJuros) {
        this.calculadorDeJuros = calculadorDeJuros;
    }

    public int calculaJuros(Pedido pedido) {
        return this.calculadorDeJuros.getTaxaDeJuros(pedido);
    }

}
