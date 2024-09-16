import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int NUM_ESTUDANTES = 5;
        double somaDasMedias = 0;
        double media;
        
        // Laço para ler as médias dos estudantes e calcular a soma
        for (int i = 1; i <= NUM_ESTUDANTES; i++) {
            System.out.println("Digite a média do estudante " + i + ":");
            media = scanner.nextDouble();
            somaDasMedias += media;
            
            // Verifica se o estudante foi aprovado ou reprovado
            if (media >= 6.0) {
                System.out.println("Estudante " + i + " - Aprovado");
            } else {
                System.out.println("Estudante " + i + " - Reprovado");
            }
        }
        
        // Calcula e exibe a média das médias
        double mediaDasMedias = somaDasMedias / NUM_ESTUDANTES;
        System.out.println("\nSoma das médias: " + somaDasMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
        
        scanner.close();
    }
}
