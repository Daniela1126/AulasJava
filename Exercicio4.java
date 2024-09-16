import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário para inserir a idade
        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();
        
        // Verifica se a pessoa é maior ou menor de idade
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
