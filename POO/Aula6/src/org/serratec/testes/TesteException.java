package org.serratec.testes;

public class TesteException {

    public static void main(String[] args) {
        
        try {
            System.out.println("Resultado:" + divisao(10, 2));
            System.out.println("Passou aqui");
        } catch (ArithmeticException e) {
            System.out.println("Impossivel dividir por zero");
            e.printStackTrace();
        }
        finally{
            System.out.println("Finalizando o programa");
        }
    }

    public static int divisao(int a, int b) throws ArithmeticException{
    /*   if (b == 0) {
            throw new ArithmeticException("Impossivel dividir por zero");//throw é lançado para tratar um erro e pode ser passado uma string
        }
        return a / b; */
        return a / b;
    }
}