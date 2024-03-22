import java.util.Scanner;

public class Ex12 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.println("Digite um numero do mes: ");
        int i = leitor.nextInt();
        
        if(i < 1 &&  i > 12) {
            System.out.println("Numero invalido");

        } else {
            int numeroMes = i - 1;
            System.out.println("Mes escolhido: " + meses[numeroMes]);
        }

    }
}