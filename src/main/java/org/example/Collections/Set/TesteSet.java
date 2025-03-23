package org.example.Collections.Set;
import java.util.HashSet;
import java.util.Set;

//O set ignora os itens duplicados

public class TesteSet {
    public static void main(String[] args) {
        Set<String> contas = new HashSet<>();

        contas.add("Conta Poupanca");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Corrente");

        contas.forEach(conta ->{
                System.out.println("conta -> " + conta);
            System.out.println("Hash ->" +conta.hashCode());
        });
    }
}
