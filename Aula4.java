import java.util.Random;
import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner lendoNumero = new Scanner(System.in);
        
        // Gera um número aleatório entre 0 e 9
        final int sorteio = aleatorio.nextInt(10);
        int numeroDoUsuario;
        
        System.out.println("Tente adivinhar o número (entre 0 e 9):");
        
        // Loop para permitir várias tentativas
        while (true) {
            numeroDoUsuario = lendoNumero.nextInt();
            
            if (numeroDoUsuario == sorteio) {
                System.out.println("Parabéns! Você acertou o número!");
                break; // Sai do loop se o número estiver correto
            } else {
                System.out.println("Número incorreto. Tente novamente:");
            }
        }
        
        System.out.println("Número aleatório: " + sorteio +
                           " - Número digitado: " + numeroDoUsuario);
        
        lendoNumero.close();
    }
}
