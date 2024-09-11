import java.util.Random;
import java.util.Scanner;

public class Aula5j {
public static void main(String[]args){
    //Atribuindo os valores iniciais
    Random aleatorio = new Random();
    Scanner leitura = new Scanner(System.in);
    final int sorteio = aleatorio.nextInt(6);

    // Obtendo valores com o usuário
    System.out.println("Digite um numero");
    int numero = leitura.nextInt(), pontuacao = 30;

    //Testes de pontuação
    if( numero == sorteio) {
        System.out.println("Acertou");
        leitura.close();
        return;
    }
    System.out.println("Digite um numero");
    numero = leitura.nextInt();
    if (numero == sorteio) {
        System.out.println("Você acertou com " + pontuacao + " pontos.");    
        leitura.close();
        return;
    }else{
        pontuacao = pontuacao -10;
        System.out.println("Voce perdeu 10 pontos e está com " + pontuacao + " pontos");
    }
    leitura.close();
}
}