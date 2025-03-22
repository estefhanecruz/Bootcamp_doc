package org.example.Abstratas;

public class TesteClasseAbstrata {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.imprimirExtrato();

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.imprimirExtrato();
    }
}
