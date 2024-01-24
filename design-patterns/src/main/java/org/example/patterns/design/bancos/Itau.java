package org.example.patterns.design.bancos;

import org.example.patterns.design.Pedido;
import org.example.patterns.design.strategyInterface.CalculaJurosStrategyInterface;

public class Itau implements CalculaJurosStrategyInterface {

    @Override
    public int getTaxaDeJuros(Pedido pedido) {
        return 20;
    }

}
