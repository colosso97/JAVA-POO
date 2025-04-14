package exercicios;

import java.util.Arrays;

public class Contato {
    private String nome;
    private Telefone[] telefones;
    private Endereco endereco;



    
    public Contato(String nome, Telefone[] telefones, Endereco endereco) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "\n nome: " + nome + ",\n telefones: " + Arrays.toString(telefones) + ",\n endereco: " + endereco;
    }


    public String getNome() {
        return nome;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    //Metodo
    public void mostrarTelefones(){
        for (Telefone x : telefones) {
            System.out.println(x);
        }
    }
    public void adicionarTelefone(Telefone addtelefones){
        for (int i = 0; i < telefones.length; i++) {
            if (telefones[i] == null) {
                telefones[i] = addtelefones;
                break;
            }
        }
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
}
