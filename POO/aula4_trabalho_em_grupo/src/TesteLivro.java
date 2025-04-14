public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Marco antonio", "Cisco ccNA", 85.);
        Livro livro2 = new Livro("kathy sierra", "Use a cabeca java", 98.);
        
        Operacao operacao1 = new Operacao("venda", livro1);
        Operacao operacao2 = new Operacao("emprestimo", livro2);
        
        livro1.reajuste(6.);

        operacao1.venderLivro();
        operacao2.emprestarLivro();

        System.out.println(operacao1.toString());
        System.out.println(operacao2.toString());

    }
}
