package org.example.Interfaces;

public class ContaPoupanca implements Conta{

    private Double saldo = 0.00;
    private final Double taxaOperacao = 0.60;

    @Override
    public void depositar(Double valor) {
        this.saldo +=valor;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -=valor+taxaOperacao;
    }

    @Override
    public Double getSaldo() {
        return saldo;
    }
}
