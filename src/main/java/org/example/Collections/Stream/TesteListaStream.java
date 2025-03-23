package org.example.Collections.Stream;

import java.util.ArrayList;
import java.util.List;

public class TesteListaStream {
    public static void main(String[] args) {

        List <String>contas = new ArrayList();
        contas.add("Conta Poupanca");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");

        contas.stream()
                .filter(conta -> filterLista(conta))
                .forEach(conta -> System.out.println("Conta: " +conta));

        long total = contas.stream()
                .filter(conta -> filterLista(conta))
                .count();
        System.out.println("Total de Poupancas: " +total);

    }
    public static Boolean filterLista (String conta){
        return conta.contains("Poupanca");
    }
}
