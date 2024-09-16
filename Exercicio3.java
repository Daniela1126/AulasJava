import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário para inserir a temperatura em graus Celsius
        System.out.println("Digite a temperatura em graus Celsius:");
        double temperatura = scanner.nextDouble();
        
        // Verifica se a temperatura é quente ou fria
        if (temperatura > 25.0) {
            System.out.println("A temperatura é quente.");
        } else {
            System.out.println("A temperatura é fria.");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
