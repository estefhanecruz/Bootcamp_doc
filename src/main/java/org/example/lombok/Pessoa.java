package org.example.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Pessoa {
    private long id;
    private String nome;
    private Integer idade;


}
