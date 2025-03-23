package org.example.lombok;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoaJulia = new Pessoa();

        pessoaJulia.setId(100L);
        pessoaJulia.setNome("Julia Melo");
        pessoaJulia.setIdade(25);
        System.out.println(pessoaJulia.getId());
        System.out.println(pessoaJulia.getNome());
        System.out.println(pessoaJulia.getIdade());

        System.out.println(pessoaJulia);
    }
}
