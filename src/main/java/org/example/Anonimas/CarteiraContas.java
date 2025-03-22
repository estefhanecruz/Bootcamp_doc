package org.example.Anonimas;

public class CarteiraContas {
    Conta contaCorrente = new Conta(){
        public void imprimeTipoConta(){
            System.out.println("Conta corrente");
        }
    };
    Conta contaPoupanca = new Conta(){

        public void imprimeTipoConta() {
            System.out.println("Conta poupanca");
        }
    };
}
