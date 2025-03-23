package org.example.Optional;

import org.example.Collections.Set.Conta;

import java.util.Optional;

public class TesteOptional {
    public static void main(String[] args) {
        Optional<Conta> optionalConta = obtemContaSemErr();

        if (optionalConta.isPresent()){
            System.out.println("Saldo: "+ optionalConta.get().getSaldo());
        }else {
            System.out.println("Não foi localizada a conta");
        }


    }
    public static Conta obtemConta(){
        return null;
    }
    public static Optional<Conta> obtemContaSemErr(){
        return Optional.empty();
    }
}
