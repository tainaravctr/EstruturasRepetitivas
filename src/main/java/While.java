import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroCorreto = (int) (Math.random() * 100) + 1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Bem-vindo(a) ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100. ");

        while (palpite != numeroCorreto) {
            System.out.print("Digite seu palpite ➡ ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite < numeroCorreto) {
                System.out.println("O número é maior, tente novamente!");
            } else if (palpite > numeroCorreto) {
                System.out.println("O número é menor, tente novamente!");
            }
        }

        System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
        sc.close();
    }
}
