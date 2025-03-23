package org.example.modificadores;

public class Conta {
    private Double saldo;
    private String titular;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

     public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
}
