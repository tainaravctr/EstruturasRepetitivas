import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char resp = 's';

        do {
            System.out.println("Digite o valor em Reais: ");

            double R = sc.nextDouble();
            double D = 6.06;
            double soma = R / D;

            System.out.printf("O valor em dólares é de: %.2f%n", soma);
            System.out.println("Deseja consultar outro valor (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp == 's' );

        System.out.println("Obrigada por utilizar nosso programa! :)");
        sc.close();
    }
}

