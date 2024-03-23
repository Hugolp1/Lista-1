import java.util.Scanner;
public class Ex20 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o tempo da viagem (em horas): ");
        double tempo = leitor.nextDouble();
        
        System.out.print("Digite a velocidade média da viagem (em km/h): ");
        double velMedia = leitor.nextDouble();

        double litrosConsumidos = (tempo * velMedia) / 12;

        System.out.printf("A quantidade de litros de combustível gasta na viagem é:" + litrosConsumidos);
    }
}
