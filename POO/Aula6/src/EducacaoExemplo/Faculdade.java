package EducacaoExemplo;
public abstract class Faculdade extends Universidade{
    protected String nomeFaculdade;
    protected int bloco;
    
    
    public Faculdade(String nome, String nomeFaculdade, int bloco) {
        super(nome);
        this.nomeFaculdade = nomeFaculdade;
        this.bloco = bloco;
    }


    @Override
    public String toString() {
        return "Faculdade [nomeFaculdade=" + nomeFaculdade + ", bloco=" + bloco + "]";
    }


    public String getNomeFaculdade() {
        return nomeFaculdade;
    }


    public int getBloco() {
        return bloco;
    }
    public abstract String matrizCurricular();
    
    
    
}
