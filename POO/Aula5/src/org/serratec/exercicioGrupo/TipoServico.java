package org.serratec.exercicioGrupo;

//regra de construção do codigo ENUM, INTERFACE, E RELACIONAMENTOS SEM DEPENDECIAS E DEPOIS PARTE DE HERANÇA PAI E FILHO
public enum TipoServico {
// Constantes
OLEO(100.), LAVAGEM(50.), REVISAO(200.);

// Atributos
private Double valorPorServico;

// Construtor
private TipoServico(Double valorPorServico) {
this.valorPorServico = valorPorServico;
}

// Getters
public Double getValorPorServico() {
return valorPorServico;
}
}
