package br.org;

import br.org.serratec.Casa;
import br.org.serratec.Proprietario;

public class TesteImovel {

    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario("Marcos");
        Casa casa = new Casa("Centro", 200000.,proprietario, true);
    
    System.out.println("Valor do ITBI:"+ casa.calcularITBI());
    System.out.println(casa);
}
}
