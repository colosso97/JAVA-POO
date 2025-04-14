package exercicios;

public class Telefone {
    private String numero;

    public Telefone(String numero) {
        this.numero = numero;
    }

    
    @Override
    public String toString() {
        return "\n numero:" + numero;
    }


    public String getNumero() {
        return numero;
    }

    
}
