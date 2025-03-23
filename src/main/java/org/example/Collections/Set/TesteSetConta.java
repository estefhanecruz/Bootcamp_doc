package org.example.Collections.Set;
//

import java.util.HashSet;
import java.util.Set;

public class TesteSetConta {
    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<>();
        contas.add(new Conta(100L, 320.00));
        contas.add(new Conta(100L, 320.00));

        contas.forEach(conta -> System.out.println(conta));

    }
}
