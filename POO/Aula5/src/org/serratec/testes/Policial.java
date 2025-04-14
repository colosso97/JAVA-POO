package org.serratec.testes;

//final na classe não pode ter filhos
public final class Policial {
    protected String nome;
    //protected final String LOTACAO = "Brasília";
    protected final String LOTACAO;

    public Policial(String nome, String lOTACAO) {
        this.nome = nome;
        LOTACAO = lOTACAO;
    }

    //Não pode ser sobrescrito
    public final void imprimir() {
        System.out.println("Dados do policial!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLOTACAO() {
        return LOTACAO;
    }
    
}
