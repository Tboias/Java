public class TestaValores {
    public static void main(String[] args) {
        int primeiro = 5, segundo = 7;
        System.out.println(primeiro + segundo);

        segundo = primeiro;
        System.out.println(segundo);

        primeiro = 10;
        segundo = primeiro;
        System.out.print(segundo);
    }
}