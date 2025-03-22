package org.example.Interfaces;

public class TesteInterfaces {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaCorrente.depositar(5000.00);
        System.out.println("O saldo atual é de " + contaCorrente.getSaldo());

        contaPoupanca.depositar(15000.00);
        System.out.println("O saldo atual é de " +contaPoupanca.getSaldo());

        contaCorrente.sacar(367.69);
        System.out.println("O saldo atual é de " + contaCorrente.getSaldo());

        contaPoupanca.sacar(5643.00);
        System.out.println("O saldo atua é de " + contaPoupanca.getSaldo());
    }


}
