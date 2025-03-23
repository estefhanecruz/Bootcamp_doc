package org.example.Collections.Lista;
//Na lista podem haver valores repetidos

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {

        List contas = new ArrayList();
        contas.add("Conta Poupanca");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");

        System.out.println(contas.get(0));
        System.out.println(contas.get(1));
        System.out.println(contas.get(2));



    }
}
