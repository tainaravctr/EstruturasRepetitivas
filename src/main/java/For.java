import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento da senha ➡ ");
        int length = sc.nextInt();

        String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";

        String pass = "";

        for (int i = 0; i < length; i++) {

            int randomIndex = (int) (Math.random() * character.length());
            char caractere = character.charAt(randomIndex);
            pass += caractere;
        }

        System.out.println("Sua senha gerada é: " + pass);
        sc.close();
    }
}
