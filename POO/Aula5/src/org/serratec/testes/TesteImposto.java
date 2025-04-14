package org.serratec.testes;

import org.serratec.Empresa;
import org.serratec.Pessoa;
import org.serratec.calculos.TotalImposto;

public class TesteImposto {
public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Sandro", 25000.);
    Empresa empresa = new Empresa("XPTO Ltda", 100000.);
    TotalImposto ti = new TotalImposto();

    ti.calcularTotalGeralTributos(pessoa);
    ti.calcularTotalGeralTributos(empresa);

    System.out.println("Tota Geral Pago Empresa/Pessoa"+ti.getTotalGeral());

    //System.out.println("Total pagar pessoa"+ pessoa.calcularIR());
    //System.out.println("Total pagar pessoa" + empresa.calcularIR());
    //System.out.println("Total pagar pessoa" + empresa.calcularICMS());
}
}
