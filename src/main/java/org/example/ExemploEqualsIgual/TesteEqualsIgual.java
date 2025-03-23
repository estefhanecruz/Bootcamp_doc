package org.example.ExemploEqualsIgual;

public class TesteEqualsIgual {
    public static void main(String[] args) {
        String nome1 = "Geovana";
        String nome2 = "Marcia";
        String nome3 = new String ("Geovana");
        System.out.println("(nome1 == nome2): " +(nome1 == nome2));
        System.out.println("(nome1 == nome3): " +(nome1 == nome3));
        System.out.println("nome1.equals(nome2): " +nome1.equals(nome2));
        System.out.println("nome1.equals(nome3): "+nome1.equals(nome3));
    }
}
