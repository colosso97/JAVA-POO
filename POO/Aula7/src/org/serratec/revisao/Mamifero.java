package org.serratec.revisao;

import java.time.LocalDate;

public abstract class Mamifero extends Animal {
    protected String raca;

    public abstract void amamentar();

    public Mamifero(String nome, LocalDate dataVacinacao, String raca) {
        super(nome, dataVacinacao);
        this.raca = raca;
    }

    
}
