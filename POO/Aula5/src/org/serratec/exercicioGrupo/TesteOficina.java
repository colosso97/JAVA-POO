package org.serratec.exercicioGrupo;

import java.time.LocalDate;
//LocalDate.of importa a data no padrão americano no instaciamento onde o dado é localdate
public class TesteOficina {
public static void main(String[] args) {
    Proprietario proprietario = new Proprietario("Marcelo");
    Proprietario proprietario1 = new Proprietario("Marcos");
    Proprietario proprietario2 = new Proprietario("Jessica");

    Carro carro = new Carro("Chevette", LocalDate.of(   2025, 4, 5), proprietario, "Colecionador");
    Carro carro1 = new Carro("Siena", LocalDate.of(   2024, 8, 18), proprietario1, "Comum");
    Carro carro2 = new Carro("Opala", LocalDate.of(   2023, 8, 14), proprietario2, "Colecionador");

    Moto moto = new Moto("Kavasaki", LocalDate.of(1997, 10, 1), proprietario, 500);

    
    carro.trocarOleo();
    carro.revisao();

    carro1.lavarVeiculo();
    carro2.revisao();

    moto.lavarVeiculo();
    moto.trocarOleo();
    moto.revisao();

    //Exibir o nome do proprietário, os dados carro e o valor cobrado pelo serviço.
    System.out.println(carro.toString());
    System.out.println(carro1.toString());
    System.out.println(carro2.toString());
    System.out.println(moto.toString());

}
}
