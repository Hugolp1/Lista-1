import java.util.Scanner;

public class Ex06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        double temp = leitor.nextDouble();

        double fahr = (9 * temp + 160) / 5;

        System.out.println("Temperatura em Fahrenheit: " + fahr);

    }

}
