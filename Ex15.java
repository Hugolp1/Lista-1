import java.util.Scanner;
public class Ex15 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite coordenadas:");
        System.out.print("x1: ");
        double x1 = leitor.nextDouble();
        System.out.print("y1: ");
        double y1 = leitor.nextDouble();

        System.out.print("x2: ");
        double x2 = leitor.nextDouble();
        System.out.print("y2: ");
        double y2 = leitor.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("A distância entre os pontos P1 e P2 é: " + distancia);
    }
}
