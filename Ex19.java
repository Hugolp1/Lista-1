import java.util.Scanner;
public class Ex19 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a altura do cilindro: ");
        double alt = leitor.nextDouble();
        System.out.println("Digite o raio do cilindro: ");
        double raio = leitor.nextDouble();

        double volume = 3.14 * (raio * raio) * alt;

        System.out.println("Volume do cilindro: " + volume);
    }
}
