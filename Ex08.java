import java.util.Scanner;
public class Ex08 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double a = leitor.nextDouble();

        if (a >= 50) {
            System.out.println("Numero maior ou igual a 50");
        } else {
            System.out.println("Numero menor que 50");
        }
    }
}
