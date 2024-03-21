import java.util.Scanner;

public class Ex04 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double a = leitor.nextDouble();
        System.out.println("Digite outro numero: ");
        double b = leitor.nextDouble();

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtracao: " + (a - b));
        System.out.println("Multiplicacao: " + (a * b));
        System.out.println("Divisao: " + (a / b));
    }
}
