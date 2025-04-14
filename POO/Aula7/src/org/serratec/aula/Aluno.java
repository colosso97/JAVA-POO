package org.serratec.aula;

public class Aluno {
private String nome;
private String email;
private Integer idade;

public Aluno(String nome, String email, Integer idade) {
    this.nome = nome;
    this.email = email;
    this.idade = idade;
}

@Override
public String toString() {
    return "Aluno [nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
}

public String getNome() {
    return nome;
}

public String getEmail() {
    return email;
}

public Integer getIdade() {
    return idade;
}


}
