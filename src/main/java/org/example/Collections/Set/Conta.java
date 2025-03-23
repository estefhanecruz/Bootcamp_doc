package org.example.Collections.Set;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Conta {
    private Long numeroConta;
    private Double saldo;

    @Override
    public boolean equals(Object obj){
        Conta conta = (Conta) obj;
        return this.numeroConta.equals(conta.getNumeroConta());

    }
}
