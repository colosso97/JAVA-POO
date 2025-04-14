package exercicios;

public class TesteMain {
    public static void main(String[] args) {
        Estado estado1 = new Estado("Rio de Janeiro","RJ" ) ;
        Cidade cidade1 = new Cidade ( "Petropolis", estado1);
        Endereco endereco1 = new Endereco ("Rua Fonseca Ramos, 183","Centro","25610-125", cidade1);
        Contato contato1 = new Contato("Roberta",new Telefone[2], endereco1);

        Telefone telefone1 = new Telefone("22341250");
        Telefone telefone2 = new Telefone("22371350");

        contato1.adicionarTelefone(telefone1);
        contato1.adicionarTelefone(telefone2);

        System.out.println(contato1.toString());


    }
}
