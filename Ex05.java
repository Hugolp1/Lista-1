import java.util.Scanner;

public class Ex05 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double a = leitor.nextDouble();
        System.out.println("Digite outro numero: ");
        double b = leitor.nextDouble();
        double c = b;

        System.out.println("-----Valores originais-----");
        System.out.println("Valor 1: " + a + "|| Valor 2: " + b);

        b = a;
        a = c;

        System.out.println("-----Valores trocados-----");
        System.out.println("Valor 1: " + a + "|| Valor 2: " + b);
    }
}    