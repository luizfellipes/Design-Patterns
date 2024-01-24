package org.example.patterns.design;


import org.example.patterns.design.bancos.Santander;

public class Main {
    public static void main(String[] args) {

        CalculadoraDeJuros calculadoraDeJuros = new CalculadoraDeJuros(new Santander());
        calculadoraDeJuros.calculaJuros(new Pedido(10));

    }
}