import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) {
        double media;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a média: ");
        media = leitura.nextDouble();
        if (media>6.0) {
            System.out.println("Aprovado na disciplina")
        }
        leitura.close();
    }
}