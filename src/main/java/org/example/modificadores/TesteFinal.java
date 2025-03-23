package org.example.modificadores;
// Eu não posso instanciar um objeto do tipo Final e classes tipo
// Final não podem ser extendidas

public class TesteFinal {
    final static Conta contaFinal = new Conta(56.00);

    public static void main(String[] args) {
        contaFinal.setSaldo(450.00);
        System.out.println(contaFinal.getSaldo());
    }
}
