package org.example.LocalDate;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class ExemploLocalDate {
    public static void main(String[] args) {

        LocalDateTime Time = LocalDateTime.now();

        System.out.println("Dia da semana: " + Time.getDayOfWeek().name() );
        System.out.println("Mês: " +Time.getMonthValue());
        System.out.println("Mês: " +Time.getMonth());
        System.out.println("Ano: " +Time.getYear());
        System.out.println("Hora: " + Time.getHour());
        System.out.println("Minutos: " +Time.getMinute() );
        System.out.println("Segundos: " +Time.getSecond() );

        LocalDate outraData = LocalDate.of(2025, Month.NOVEMBER, 10);
        System.out.println(outraData);
        System.out.println(outraData.isLeapYear());
        System.out.println(outraData.lengthOfMonth());
    }
}
