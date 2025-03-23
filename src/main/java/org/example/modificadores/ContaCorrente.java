package org.example.modificadores;

public class ContaCorrente {
    public static void main(String[] args) {
        Conta conta = new Conta(20.0);
        conta.setSaldo(300.00);
        System.out.println(conta.getSaldo());
    }
}
