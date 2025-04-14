package EducacaoExemplo;

public final class Direito extends Faculdade implements Oab , Eventos {

    private int tempoDuracao;

    public Direito(String nome, String nomeFaculdade, int bloco, int tempoDuracao) {
        super(nome, nomeFaculdade, bloco);
        this.tempoDuracao = tempoDuracao;
    }

    @Override
    public String toString() {
        return "Direito [tempoDuracao=" + tempoDuracao + "]";
    }

    @Override
    public String programacao() {
    return null;
    }

    @Override
    public void conteudoEventos() {
        
    }

    @Override
    public Boolean realizarProva() {
        return null;
    }


    @Override
    public String matrizCurricular() {
        return null;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public void fazerMatricula() {

    }
}
