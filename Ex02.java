import java.util.Scanner;

public class Ex02 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double a = leitor.nextDouble();
        System.out.println("Digite outro numero:");
        double b = leitor.nextDouble();
        double soma = a + b;

        System.out.println("A soma dos numeros e igual a " + soma);
    }
}
