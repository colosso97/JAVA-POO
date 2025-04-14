package exercicios;

public class Estado {
    private String nomeEstado;
    private String sigla;
    
    public Estado(String nomeEstado, String sigla) {
        this.nomeEstado = nomeEstado;
        this.sigla = sigla;
    }

    
    @Override
    public String toString() {
        return "\n Estado:" + nomeEstado + ",\n sigla:" + sigla;
    }


    public String getNomeEstado() {
        return nomeEstado;
    }

    public String getSigla() {
        return sigla;
    }

    
}
