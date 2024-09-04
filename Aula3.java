/**
 * Faça um sistema em Java para a leitura dos nomes de conco funcionários e em seguida mostre o nome digitado desses funcionários.
 */
import java.util.Scanner;
public class Aula3 {

    public static void main(String[] args) {
        Scanner leitorTxt = new Scanner(System.in);
        System.out.println("Digite nome 1:\n");
        String nome1 = leitorTxt.nextLine();
        System.out.println("Digite o nome 2:\n");
        String nome2 = leitorTxt.nextLine();
        System.out.println("Digite o nome 3:\n");
        String nome3 = leitorTxt.nextLine();
        System.out.println("Digite o nome 4:\n");
        String nome4 = leitorTxt.nextLine();
        System.out.println("Digite o nome 5:\n");
        String nome5 = leitorTxt.nextLine();
        System.out.println("Seu nome é: " + nome1 + ", " + nome2 + ", " + nome3 + ", " + nome4 + " e " + nome5);
        leitorTxt.close();
    }
}