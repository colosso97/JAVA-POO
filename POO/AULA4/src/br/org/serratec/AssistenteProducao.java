package br.org.serratec;

public class AssistenteProducao extends Assistente {
    private Integer meta;

    public AssistenteProducao(String cpf, String nome, Double salario, Double adicional, Integer meta) {
        super(cpf, nome, salario, adicional);
        this.meta = meta;
    }

    @Override
    public String toString() {
        return "AssistenteProducao [adicional=" + adicional + ", meta=" + meta + ", salario=" + salario + "]";
    }

    public Integer getMeta() {
        return meta;
    }

    
}
