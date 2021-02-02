public class TesteCondicional {
    public static void main(String[] args) {

        // Variaveis
        int quantidadePessoas = 3;
        int idade = 20;
        boolean acompanhado = quantidadePessoas >= 2;
        // Variaveis

        if (idade >= 18 && acompanhado) {

            System.out.println(" Seja Bem Vindo ! ");

        } else {

            System.out.println(" Infelizmente voce nao pode entrar ");

        }
    }
}