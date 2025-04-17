public class Freelancer extends Vendedor{
    private int diastrabalhados;
    private Double valordia;
    
    public Freelancer(String nome, String cpf, int diastrabalhados, Double valordia) {
        super(nome, cpf);
        this.diastrabalhados = diastrabalhados;
        this.valordia = valordia;
    }

    public int getDiastrabalhados() {
        return diastrabalhados;
    }

    public void setDiastrabalhados(int diastrabalhados) {
        this.diastrabalhados = diastrabalhados;
    }

    public Double getValordia() {
        return valordia;
    }

    public void setValordia(Double valordia) {
        this.valordia = valordia;
    }

    

    
}
