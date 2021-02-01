public class TesteCondicional {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");
        int idade = 17;
        int quantidadePessoas = 3;
        if (idade >= 18) {

            System.out.println(" Você é de maior.");
            System.out.println(" Seja Bem Vindo ! ");

        } else {
            if (quantidadePessoas >= 2) {

                System.out.println(" Você é de menor.");
                System.out.println(" Porem está acompanhado. ");
                System.out.println(" Seja Bem Vindo ! ");

            } else {
                System.out.println(" Infelizmente voce nao pode entrar ");
            }
        }
    }
}