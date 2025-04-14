package EducacaoExemplo;
public final class TecnicoConcomitante extends ColegioAplicacao{
    private String nomeCurso;


    public TecnicoConcomitante(String nome, String nomeCoordenador, String nomeCurso) {
        super(nome, nomeCoordenador);
        this.nomeCurso = nomeCurso;
    }


    @Override
    public void reuniaoDePais() {
    }

    @Override
    public void fazerMatricula() {
    }


    public String getNomeCurso() {
        return nomeCurso;
    }

    
}
