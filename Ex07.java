import java.util.Scanner;

public class Ex07 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double a = leitor.nextDouble();

        if(a >= 100 && a <= 200){
            System.out.println("Esse numero esta entre 100 e 200!");
        } else {
            System.out.println("Esse numero nao esta entre 100 e 200");
        }

    }
}
