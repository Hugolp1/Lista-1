import java.util.Scanner;

public class Ex11 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int valor1 = leitor.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int valor2 = leitor.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int valor3 = leitor.nextInt();
        
        if (valor1 > valor2) {
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }
        if (valor2 > valor3) {
            int temp = valor2;
            valor2 = valor3;
            valor3 = temp;
        }
        if (valor1 > valor2) {
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        System.out.println("Valores em ordem crescente: " + valor1 +", " + valor2 +", " + valor3 +", ");
    }
}
