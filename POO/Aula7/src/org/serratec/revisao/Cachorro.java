package org.serratec.revisao;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico{
    private Boolean castrado;
    
    public Cachorro(String nome, LocalDate dataVacinacao, String raca, Boolean castrado) {
        super(nome, dataVacinacao, raca);
        this.castrado = castrado;
    }

    @Override
    public String toString() {
        return "Cachorro [castrado=" + castrado + "]";
    }

    @Override
    public Boolean levarVeterinario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'levarVeterinario'");
    }

    @Override
    public Boolean alimentar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alimentar'");
    }

    @Override
    public void amamentar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'amamentar'");
    }

    @Override
    public String emitirSom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emitirSom'");
    }



}
